package site.clzblog.source.code.analyze.mybatis.handwriting.decorator;

import site.clzblog.source.code.analyze.mybatis.handwriting.component.CacheComponent;

public abstract class AbstractCacheComponentDecorator implements CacheComponent {
    private CacheComponent cacheComponent;

    public AbstractCacheComponentDecorator(CacheComponent cacheComponent) {
        this.cacheComponent = cacheComponent;
    }

    protected CacheComponent getCacheComponent() {
        return cacheComponent;
    }
}
