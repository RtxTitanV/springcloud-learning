package com.rtxtitanv.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author rtxtitanv
 * @version v1.0.0
 * @name com.rtxtitanv.config.WebSecurityConfig
 * @description WebSecurityConfig
 * @date 2020/3/13 20:55
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
        //关闭security的csrf检验
        http.csrf().disable();
        //为了可以使用http://${user}:${password}@${host}:${port}/eureka/这种方式登录，所以必须是httpBasic，
        //如果是form方式，不能使用url格式登录
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
