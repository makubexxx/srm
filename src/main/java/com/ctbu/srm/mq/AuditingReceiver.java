package com.ctbu.srm.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/4 10:06
 * @Email 308348194@qq.com
 */
@Component
@RabbitListener(queues = "audit")
public class AuditingReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }
}
