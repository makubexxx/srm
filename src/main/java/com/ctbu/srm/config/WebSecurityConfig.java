package com.ctbu.srm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/8 19:53
 * @Email 308348194@qq.com
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

}
