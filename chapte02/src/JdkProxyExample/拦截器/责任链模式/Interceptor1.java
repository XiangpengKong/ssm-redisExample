package JdkProxyExample.拦截器.责任链模式;

import JdkProxyExample.拦截器.Interceptor;

import java.lang.reflect.Method;

/**
 * Created by KING on 2017/9/14.
 */
public class Interceptor1 implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器【1】：before");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器【1】：around");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器【1】：after");
    }
}
