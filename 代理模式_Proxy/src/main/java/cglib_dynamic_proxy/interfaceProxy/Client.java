package cglib_dynamic_proxy.interfaceProxy;

/**
 * @Author Mapleins
 * @Date 2019-06-14 9:25
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Singer singer = new SingerImpl();
        Singer singerProxy = (Singer) new InterfaceProxy().newInstance(singer);
        singerProxy.sing();
    }
}
