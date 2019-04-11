package com.ctbu.srm.entity;

import lombok.Data;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/11 15:14
 * @Email 308348194@qq.com
 */
@Data
public class RemoteMessage<T> {

    private String type;
    private T content;
    private String sender;
    private String room_key;
    private String path;
}