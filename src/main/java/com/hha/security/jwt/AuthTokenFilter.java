package com.hha.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.hha.services.impl.UserDetailsServiceImpl;
import com.hha.utils.JwtUtil;

public class AuthTokenFilter extends OncePerRequestFilter {
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private UserDetailsServiceImpl userDetailsServicesImpl;
	
	private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			String jwt = parseJwt(request);
			if(jwt!=null && jwtUtil.validateJwtToken(jwt)) {}
		} catch (Exception e) {
			logger.error("Can't set user authentication: {}",e);
		}
		filterChain.doFilter(request, response);
	}
	private String parseJwt(HttpServletRequest request) {
		String headerAuth = request.getHeader("Authoration");
		if(StringUtils.hasText(headerAuth) && headerAuth.startsWith("HHauthor ")) {
			return headerAuth.substring(9,headerAuth.length());
		}
		return null;
	}

}
