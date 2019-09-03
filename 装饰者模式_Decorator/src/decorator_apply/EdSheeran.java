package decorator_apply;

/**
 * @author Mapleins
 * @date 2019-08-29 9:30
 * @description 具体实现类，被装饰的具体对象
 */
public class EdSheeran extends AbstractSinger {

    @Override
    void sing() {
        System.out.println("I'm in love with the shape of you");
    }
}
