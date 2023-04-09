package com.hha.security.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.hha.services.impl.UserDetailsImpl;
import com.hha.services.impl.UserServiceImpl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;

@Component

public class JwtTokenController {
	private final String JWT_SECRET = "baDuHongHa";
	private final long JWT_EXPIRATION = 604800000L;
	private Logger log;
	public String generateToken(UserDetailsImpl userDetail) {
		Date now = new Date();
		Map<String, Object> payLoadMap = new HashMap<String, Object>();
		String payLoadCustom[];
		Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
		for (GrantedAuthority permission : userDetail.getAuthorities()) {
			String cash2String = permission.toString();
			payLoadCustom = cash2String.replaceAll("[{}]", "").split(",");// {userId:123,roleId:1,perId:1,...}>userId:123,...
			String key = payLoadCustom[0].trim();
			String value = payLoadCustom[1].trim();
			payLoadMap.put(key, value);
		}
		return Jwts.builder()
				.setSubject(userDetail.getUsername())
				.addClaims(payLoadMap)
				.setIssuedAt(now)
				.setExpiration(expiryDate)
				.signWith(SignatureAlgorithm.ES384, JWT_SECRET)
				.compact();
	}

	public Long getUserIdFromJWT(String token) {
		Claims claims = Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
		return Long.parseLong(claims.getSubject());
	}
	public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(authToken);
            return true;
        } catch (MalformedJwtException ex) {
            log.error("Invalid JWT token");
        } catch (ExpiredJwtException ex) {
            log.error("Expired JWT token");
        } catch (UnsupportedJwtException ex) {
            log.error("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            log.error("JWT claims string is empty.");
        }
        return false;
	}
}
