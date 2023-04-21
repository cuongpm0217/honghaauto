package com.hha.security.jwt;

import com.hha.entities.User;
import com.hha.services.impl.UserServiceImpl;
import com.hha.utils.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthTokenFilter extends OncePerRequestFilter {
    private static final Logger logger = LoggerFactory.getLogger(AuthTokenFilter.class);
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private JwtTokenController tokenProvider;
    @Autowired
    private UserServiceImpl userDetailsServicesImpl;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            String jwt = parseJwt(request);
            if (jwt != null && jwtUtil.validateJwtToken(jwt)) {
            	Long userId = tokenProvider.getUserIdFromJWT(jwt);
            	User user = userDetailsServicesImpl.getById(userId);
            	UserDetails userDetail =  userDetailsServicesImpl.loadUserByUsername(user.getUserName());
            	if (userDetail!=null) {
            		UsernamePasswordAuthenticationToken
                    authentication = new UsernamePasswordAuthenticationToken(userDetail, null, userDetail.getAuthorities());
            		authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            		SecurityContextHolder.getContext().setAuthentication(authentication);
				}
            }
        } catch (Exception e) {
            logger.error("Can't set user authentication: {}", e);
        }
        filterChain.doFilter(request, response);
    }

    private String parseJwt(HttpServletRequest request) {
        String headerAuth = request.getHeader("Authoration");
        if (StringUtils.hasText(headerAuth) && headerAuth.startsWith("HHauthor ")) {
            return headerAuth.substring(9, headerAuth.length());
        }
        return null;
    }

}
