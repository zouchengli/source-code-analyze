package site.clzblog.source.code.analyze.map.linked;

import site.clzblog.source.code.analyze.list.linked.LinkedList;
import site.clzblog.source.code.analyze.map.Map;

public class LinkedListHashMap<K, V> implements Map<K, V> {
    private LinkedList[] objects = new LinkedList[100];

    @Override
    public int size() {
        return 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public V put(K key, V val) {
        int hash = hash(key.hashCode());
        LinkedList<Entry> linkedList = objects[hash];
        Entry<K, V> entry = new Entry<>(key, val);
        if (null == linkedList) {
            linkedList = new LinkedList();
            linkedList.add(entry);
            objects[hash] = linkedList;
            return val;
        }

        for (int j = 0; j < linkedList.size(); j++) {
            Entry<K, V> entryCopy = linkedList.get(j);
            if (entryCopy.getKey().equals(key)) {
                entryCopy.setValue(val);
                return val;
            }
        }

        linkedList.add(entry);
        objects[hash] = linkedList;
        return val;
    }

    private int hash(int hashCode) {
        return hashCode % objects.length;
    }

    @SuppressWarnings("unchecked")
    @Override
    public V get(K key) {
        if (null == key) return null;
        LinkedList<Entry<K, V>> linkedList = objects[hash(key.hashCode())];
        for (int i = 0; i < linkedList.size(); i++) {
            Entry<K, V> entry = linkedList.get(i);
            if (key.equals(entry.getKey())) return entry.getValue();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private V uncheckGetValue(Object object) {
        return (V) object;
    }

    static class Entry<K, V> implements Map.Entry<K, V> {
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
