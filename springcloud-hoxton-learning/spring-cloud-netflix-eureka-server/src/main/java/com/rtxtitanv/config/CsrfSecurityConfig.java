package com.rtxtitanv.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author rtxtitanv
 * @version 1.0.0
 * @name com.rtxtitanv.config.CsrfSecurityConfig
 * @description 关闭security的csrf检验
 * @date 2020/2/15 12:01
 */
@EnableWebSecurity
public class CsrfSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}