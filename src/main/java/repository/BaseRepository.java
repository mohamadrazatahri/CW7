package repository;

public interface BaseRepository <T, V> {
    T creat(T t);
    T read(T t);
    T update(T t);
    T delete(V v);

}
