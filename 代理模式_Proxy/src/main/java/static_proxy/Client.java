package static_proxy;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Singer singer = new SingerImpl();
        SingerProxy proxy = new SingerProxy(singer);
        proxy.sing();
    }
}
