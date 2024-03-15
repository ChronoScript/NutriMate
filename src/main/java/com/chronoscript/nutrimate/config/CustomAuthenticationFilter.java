package com.chronoscript.nutrimate.config;

import com.chronoscript.nutrimate.service.UserService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

public class CustomAuthenticationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Extract token from Authorization header
        String token = httpRequest.getHeader("Authorization");

        if (token != null && validateToken(token)) {
            // Token is valid, set authentication in Spring Security context
            Authentication authentication = new UsernamePasswordAuthenticationToken(token,token);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            chain.doFilter(request, response); // Proceed with the request
        } else {
            // Token is missing or invalid, respond with Unauthorized status
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }

    public boolean validateToken(String token) {
        // Example validation logic
        // In a real scenario, you'd check this token against those stored in a database or cache.
        return token != null && !token.isEmpty(); // This is overly simplistic for demonstration.
    }
}
