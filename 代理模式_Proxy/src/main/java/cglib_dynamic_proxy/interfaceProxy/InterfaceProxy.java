package cglib_dynamic_proxy.interfaceProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author Mapleins
 * @Date 2019-06-14 9:20
 * @Description
 */
public class InterfaceProxy implements MethodInterceptor {

    public Object newInstance(Object source) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(source.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before");
        Object val = proxy.invokeSuper(obj, args);
        System.out.println("after");
        return val;
    }
}
