package com.test.springsecurity.filterquestion.configuration;

import com.test.springsecurity.filterquestion.security.StatelessAuthenticationFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created on 8/7/17.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/user").permitAll()
                .anyRequest().authenticated().and()
                .addFilterBefore(new StatelessAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)
        ;
    }
}
