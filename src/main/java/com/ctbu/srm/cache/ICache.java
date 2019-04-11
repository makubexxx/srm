package com.ctbu.srm.cache;

import java.util.List;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/9 14:35
 * @Email 308348194@qq.com
 * 通用缓存接口
 */
public interface  ICache {
    void put(String cacheName, Object key, Object value);

    <T> T get(String cacheName, Object key);

    @SuppressWarnings("rawtypes")
    List getKeys(String cacheName);

    void remove(String cacheName, Object key);

    void removeAll(String cacheName);

    <T> T get(String cacheName, Object key, ILoader iLoader);

    <T> T get(String cacheName, Object key, Class<? extends ILoader> iLoaderClass);
}
