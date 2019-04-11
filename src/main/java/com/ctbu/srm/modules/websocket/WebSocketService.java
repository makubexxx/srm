package com.ctbu.srm.modules.websocket;

import com.ctbu.srm.entity.RemoteMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/11 15:12
 * @Email 308348194@qq.com
 */
public class WebSocketService {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketService.class);

    @Autowired
    private SimpMessagingTemplate template;

    /**
     * 广播
     * 发给所有在线用户
     *
     * @param msg
     */
    public void sendMsg(RemoteMessage msg) {
        logger.info("WebSocketService->send2global:" + msg.toString());
        template.convertAndSend("/topic/global", msg);
    }

    /**
     * 发送给指定用户
     *
     * @param msg
     */
    public void send2room(String roomName, RemoteMessage msg) {
        logger.info("WebSocketService->send2room:" + roomName);
        template.convertAndSendToUser(roomName, "/msg", msg);
    }

}
