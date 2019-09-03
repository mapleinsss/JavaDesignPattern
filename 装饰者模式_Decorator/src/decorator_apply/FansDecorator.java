package decorator_apply;

/**
 * @author Mapleins
 * @date 2019-08-29 9:36
 * @description 装饰者具体实现类，只对抽象装饰者做出具体实现
 */
public class FansDecorator extends AbstractSingerDecorator{

    public FansDecorator(AbstractSinger singer) {
        super(singer);
    }

    @Override
    void sing() {
        cheer();
        super.sing();
        singTogether();
    }

    private void cheer(){
        System.out.println("黄老板 我爱你！！！");
    }

    private void singTogether(){
        System.out.println("I'm in love with the shape of you~~~");
    }
}
