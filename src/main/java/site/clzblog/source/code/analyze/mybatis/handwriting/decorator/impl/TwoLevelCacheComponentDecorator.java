package site.clzblog.source.code.analyze.mybatis.handwriting.decorator.impl;

import site.clzblog.source.code.analyze.mybatis.handwriting.component.CacheComponent;
import site.clzblog.source.code.analyze.mybatis.handwriting.decorator.AbstractCacheComponentDecorator;

import java.util.HashMap;
import java.util.Map;

public class TwoLevelCacheComponentDecorator extends AbstractCacheComponentDecorator {
    private Map<String, Object> cache = new HashMap<String, Object>();

    public TwoLevelCacheComponentDecorator(CacheComponent cacheComponent) {
        super(cacheComponent);
        System.out.println("Two level cache");
    }

    public void putCache(String key, Object value) {
        cache.put(key, value);
    }

    public Object getCache(String key) {
        System.out.println("Two level get cache");
        Object cache = this.cache.get(key);
        if (null == cache) {
            Object oneLevelCacheComponentCache = super.getCacheComponent().getCache(key);
            if (oneLevelCacheComponentCache != null) {
                putCache(key, oneLevelCacheComponentCache);
                cache = oneLevelCacheComponentCache;
            }
        }
        return cache;
    }
}
