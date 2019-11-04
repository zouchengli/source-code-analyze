package site.clzblog.source.code.analyze.map.array;

import site.clzblog.source.code.analyze.list.List;
import site.clzblog.source.code.analyze.list.array.ArrayList;
import site.clzblog.source.code.analyze.map.Map;

public class ArrayListHashMap<K,V> implements Map<K,V> {
    private List<Entry<K, V>> entryList = new ArrayList<>();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public V put(K key, V val) {
        Entry<K, V> entry = new Entry<>(key, val);
        entryList.add(entry);
        return val;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < entryList.size(); i++) {
            Entry<K, V> entry = entryList.get(i);
            if (entry.getKey().equals(key)) return entry.getValue();
        }
        return null;
    }

     static class Entry<K,V> implements Map.Entry<K,V> {
        private K k;

        private V v;

        private Entry() {
        }

        Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }

        @Override
        public V setValue(V value) {
            this.v = value;
            return v;
        }
    }

}
