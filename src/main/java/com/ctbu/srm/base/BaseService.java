package com.ctbu.srm.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Meiziyu
 * @Date: 2019/3/13 11:30
 * @Email 308348194@qq.com
 */
@Service
public class BaseService {

    public static final String STATUS_SUCCESS = "0";
    public static final String STATUS_FAILED = "1";

    private final ConcurrentHashMap<String, Object> parallelLockMap = new ConcurrentHashMap<>();

    /**
     * 获取对象锁
     *
     * @param key
     * @return
     */
    protected Object getLock(String key) {
        Object lock = this;
        if (parallelLockMap != null) {
            Object newLock = new Object();
            lock = parallelLockMap.putIfAbsent(key, newLock);
            if (lock == null) {
                lock = newLock;
            }
        }
        return lock;
    }

    /**
     * 移除对象锁
     *
     * @param key
     */
    protected void removeLock(String key) {
        parallelLockMap.remove(key);
    }

    public Gson gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").disableHtmlEscaping().create();
}
