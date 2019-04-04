package com.ctbu.srm.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/4 10:09
 * @Email 308348194@qq.com
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue() {
        return new Queue("audit");
    }
}
