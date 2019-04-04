package com.ctbu.srm.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/4 10:25
 * @Email 308348194@qq.com
 */
@Configuration
@ConfigurationProperties(prefix = "spring.mail")
public class EmailConfig {

    private String host;

    private Integer port;

    private String username;

    private String password;
}
