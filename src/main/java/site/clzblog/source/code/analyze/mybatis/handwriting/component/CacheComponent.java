package site.clzblog.source.code.analyze.mybatis.handwriting.component;

public interface CacheComponent {
    void putCache(String key, Object value);

    Object getCache(String key);
}
