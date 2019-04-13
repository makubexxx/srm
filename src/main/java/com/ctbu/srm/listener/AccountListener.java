package com.ctbu.srm.listener;

import com.ctbu.srm.entity.AccountExtCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/12 16:43
 * @Email 308348194@qq.com
 * 账号监听，处理账号创建成功的后续逻辑
 */
@Component
public class AccountListener {

    @Autowired
    UserExtendServiceImpl userExtendService;

    /**
     * 用户扩展表初始化
     * @param event
     */
    @EventListener
    public void AccountExtCreatedEvent(AccountExtCreatedEvent event) {

        UserExtend userExtend =new UserExtend();
        userExtend.setUserId(event.getUserId());
        userExtend.setMessageCount(0);
        userExtendService.insert(userExtend);
    }
}
