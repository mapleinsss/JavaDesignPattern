package cglib_dynamic_proxy.classProxy;

/**
 * @Author Mapleins
 * @Date 2019-06-14 9:10
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Singer singer = (Singer) new ClassProxy().newInstance(new Singer());
        singer.sing();
    }
}
