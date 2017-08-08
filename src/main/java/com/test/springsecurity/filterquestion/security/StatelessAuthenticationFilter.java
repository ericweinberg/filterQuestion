package com.test.springsecurity.filterquestion.security;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created on 8/7/17.
 */
public class StatelessAuthenticationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("In the authentication filter");

        chain.doFilter(request, response);
    }
}
