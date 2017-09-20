package JdkProxyExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by KING on 2017/9/13.
 */
public class JdkProxyExample implements InvocationHandler {
    private Object target = null;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        System.out.println("进入代理逻辑方法：");
        System.out.println("在调用真实对象之前的方法，");
        Object obj = method.invoke(target,args);
        System.out.println("在调用真实对象之后的方法。");
        return obj;
    }


}
