package JdkProxyExample.拦截器;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by KING on 2017/9/14.
 */
public class InterceptorJdkProxy implements InvocationHandler {
    private Object target; //真实对象
    private String interceptorClass = null; //拦截器全限定名

    public InterceptorJdkProxy(Object target,String interceptorClass){
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    /**
     * 绑定委托对象并返回一个【代理占位】
     *
     * @param target 真是对象
     * @param interceptorClass
     * @return 代理对象【占位】
     */
    public  static Object bind(Object target,String interceptorClass){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new InterceptorJdkProxy(target,interceptorClass));
    }

    /**
     * 通过代理对象调用方法，首先进入这个方法
     *
     * @param proxy 代理对象
     * @param method 方法
     * @param args 运行方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(interceptorClass == null){
            //没有拦截器返回原方法
            return method.invoke(target, args);
        }

        Object result = null;
        //反射生成拦截器
        Interceptor interceptor = (Interceptor)Class.forName(interceptorClass).newInstance();

        //调用前置方法
        if(interceptor.before(proxy,target,method,args)){
            result = method.invoke(target,args);
        }else{
            //返回false，执行around方法
            interceptor.around(proxy,target,method,args);
        }

        //调用后置方法
        interceptor.after(proxy,target,method,args);
        return result;
    }
}
