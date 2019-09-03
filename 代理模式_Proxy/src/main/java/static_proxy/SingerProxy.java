package static_proxy;

/**
 * 代理角色：实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
 * 经纪人，代理歌手去做其他的事情，歌手只负责唱歌
 */
public class SingerProxy implements Singer {

    private Singer singer;

    public SingerProxy(final Singer singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        System.out.println("经纪人举办演唱会");
        singer.sing();
        System.out.println("经纪人喊666");
    }
}
