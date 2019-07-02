package site.clzblog.source.code.analyze.mybatis.handwriting.component.impl;

import site.clzblog.source.code.analyze.mybatis.handwriting.component.CacheComponent;

import java.util.HashMap;
import java.util.Map;

public class OneLevelCacheComponent implements CacheComponent {
    public OneLevelCacheComponent() {
        System.out.println("One level cache");
    }

    private Map<String, Object> cache = new HashMap<String, Object>();

    public void putCache(String key, Object value) {
        cache.put(key, value);
    }

    public Object getCache(String key) {
        System.out.println("One level get cache");
        return cache.get(key);
    }
}
