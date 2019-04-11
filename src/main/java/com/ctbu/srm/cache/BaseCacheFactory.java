package com.ctbu.srm.cache;

import java.util.List;

/**
 * @Author: Meiziyu
 * @Date: 2019/4/9 14:37
 * @Email 308348194@qq.com
 */
public abstract  class BaseCacheFactory implements ICache  {
    @Override
    public void put(String cacheName, Object key, Object value) {

    }

    @Override
    public <T> T get(String cacheName, Object key) {
        return null;
    }

    @Override
    public List getKeys(String cacheName) {
        return null;
    }

    @Override
    public void remove(String cacheName, Object key) {

    }

    @Override
    public void removeAll(String cacheName) {

    }

    @Override
    public <T> T get(String cacheName, Object key, ILoader iLoader) {
        return null;
    }

    @Override
    public <T> T get(String cacheName, Object key, Class<? extends ILoader> iLoaderClass) {
        return null;
    }
}
