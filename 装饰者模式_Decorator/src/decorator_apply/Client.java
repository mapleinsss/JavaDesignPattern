package decorator_apply;

/**
 * @author Mapleins
 * @date 2019-08-29 9:51
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        // 真实对象
        EdSheeran edSheeran = new EdSheeran();
        FansDecorator fansDecorator = new FansDecorator(edSheeran);
        fansDecorator.sing();
    }
}
