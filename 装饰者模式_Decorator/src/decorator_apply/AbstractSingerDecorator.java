package decorator_apply;

/**
 * @author Mapleins
 * @date 2019-08-29 9:33
 * @description TODO
 */
public abstract class AbstractSingerDecorator extends AbstractSinger {

    private AbstractSinger singer;

    public AbstractSingerDecorator(AbstractSinger singer) {
        this.singer = singer;
    }

    @Override
    void sing() {
        singer.sing();
    }
}
