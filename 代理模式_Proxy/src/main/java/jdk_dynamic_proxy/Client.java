package jdk_dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * newProxyInstance：三个参数
 * 1.ClassLoader loader：获取当前对象的类加载器，就是生成一个代理对象
 * 真实对象.getClass().getClassLoader():
 * getClass()：获取当前对象所属的 Class 对象
 * getClassLoader()：获取当前 Class 对象的类装载器
 * 类装载器：查找类所在位置，并将找到的Java类的字节码装入内存，生成对应的Class对象
 * 2.Class<?>[] interfaces
 * 真实对象.getClass().getInterfaces(): 获取真实对象所实现的所有接口
 * 3.InvocationHandler h
 * 指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
 */
public class Client {
    public static void main(String[] args) {
        Singer realSinger = new SingerImpl();
        Singer proxySinger = (Singer) Proxy.newProxyInstance(realSinger.getClass().getClassLoader(), realSinger.getClass().getInterfaces(), new DynamicProxyHandler(realSinger));
        proxySinger.sing();
    }
}
