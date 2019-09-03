package iterator.apply;

/**
 * 迭代器接口
 * @param <E>
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
