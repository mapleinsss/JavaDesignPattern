package iterator.apply;

/**
 * @author Mapleins
 * @date 2019-08-29 11:03
 * @description 简单容器接口
 */
public interface Container {

    void add(Object o);
    void remove(Object o);
    Iterator iterator();
}
