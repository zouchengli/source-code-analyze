package site.clzblog.source.code.analyze.map;

public interface Map<K, V> {
    int size();

    V put(K key, V val);

    V get(K key);

    interface Entry<K,V> {
        K getKey();
        V getValue();
        V setValue(V value);
    }
}
