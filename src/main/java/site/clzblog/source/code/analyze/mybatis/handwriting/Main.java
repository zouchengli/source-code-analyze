package site.clzblog.source.code.analyze.mybatis.handwriting;

import site.clzblog.source.code.analyze.mybatis.handwriting.component.CacheComponent;
import site.clzblog.source.code.analyze.mybatis.handwriting.factory.CacheFactory;

public class Main {
    public static void main(String[] args) {
        CacheComponent cache = CacheFactory.getCache();
        System.out.println(cache.getCache("test"));
    }
}
