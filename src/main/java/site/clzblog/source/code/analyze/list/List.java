package site.clzblog.source.code.analyze.list;

public interface List<E> {
    int size();

    boolean add(E e);

    E get(int index);

    E remove(int index);
}
