package site.clzblog.source.code.analyze.mybatis.handwriting.decorator.impl;

import site.clzblog.source.code.analyze.mybatis.handwriting.component.CacheComponent;
import site.clzblog.source.code.analyze.mybatis.handwriting.decorator.AbstractCacheComponentDecorator;

import java.util.HashMap;
import java.util.Map;

public class ThreeLevelCacheComponentDecorator extends AbstractCacheComponentDecorator {
    private Map<String, Object> cache = new HashMap<String, Object>();

    public ThreeLevelCacheComponentDecorator(CacheComponent cacheComponent) {
        super(cacheComponent);
        System.out.println("Three level cache");
    }

    public void putCache(String key, Object value) {
        cache.put(key, value);
    }

    public Object getCache(String key) {
        System.out.println("Three level get cache");
        Object cache = this.cache.get(key);
        if (null == cache) {
            Object supperCache = super.getCacheComponent().getCache(key);
            if (supperCache != null) {
                this.cache.put(key, supperCache);
                cache = supperCache;
            }
        }
        return cache;
    }
}
