package cglib_dynamic_proxy.interfaceProxy;

/**
 * 真实角色：实现抽象角色，定义真实角色所要实现的业务逻辑
 * 唱歌实现类，唱歌
 */
public class SingerImpl implements Singer {
    public void sing() {
        System.out.println("one two three ,la la la ~~");
    }
}
