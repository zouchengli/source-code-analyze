package site.clzblog.source.code.analyze.mybatis.handwriting.factory;

import site.clzblog.source.code.analyze.mybatis.handwriting.component.CacheComponent;
import site.clzblog.source.code.analyze.mybatis.handwriting.component.impl.OneLevelCacheComponent;
import site.clzblog.source.code.analyze.mybatis.handwriting.decorator.impl.ThreeLevelCacheComponentDecorator;
import site.clzblog.source.code.analyze.mybatis.handwriting.decorator.impl.TwoLevelCacheComponentDecorator;

public class CacheFactory {
    public static CacheComponent getCache() {
        OneLevelCacheComponent oneLevelCacheComponent = new OneLevelCacheComponent();
        oneLevelCacheComponent.putCache("test", "content");
        return new ThreeLevelCacheComponentDecorator(new TwoLevelCacheComponentDecorator(oneLevelCacheComponent));
    }
}
