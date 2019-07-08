package cglib_dynamic_proxy.classProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author Mapleins
 * @Date 2019-06-13 16:16
 * @Description 使用 cglib 实现接口代理
 */
public class ClassProxy implements MethodInterceptor {

    public Object newInstance(Object source) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(source.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object val = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return val;
    }
}
