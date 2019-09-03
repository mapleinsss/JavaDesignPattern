package iterator.apply;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mapleins
 * @date 2019-08-29 11:04
 * @description 容器实现类
 */
public class ContainerImpl implements Container {

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public void remove(Object o) {
        list.remove(o);
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(list);
    }
}
