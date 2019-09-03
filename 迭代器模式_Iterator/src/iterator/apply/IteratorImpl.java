package iterator.apply;

import java.util.List;

/**
 * @author Mapleins
 * @date 2019-08-29 10:56
 * @description 迭代器实现类
 */
public class IteratorImpl<E> implements Iterator {

    private List list = null;
    private int cursor = 0;

    public IteratorImpl(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
