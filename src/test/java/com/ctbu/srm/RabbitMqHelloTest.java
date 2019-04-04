package com.ctbu.srm;

import com.ctbu.srm.mq.AuditingSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/4 10:10
 * @Email 308348194@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {
    @Autowired
    private AuditingSender auditingSender;

    @Test
    public void hello() throws Exception {
        auditingSender.send();
    }
}
