package com.ctbu.srm.util;

import java.util.UUID;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/13 10:34
 * @Email 308348194@qq.com
 */
public class UUIDUtil {

    /**
     * 生成唯一id
     *
     * @return
     */
    public static String createId() {
        String string = UUID.randomUUID().toString().replace("-", "");
        return string;
    }
}
