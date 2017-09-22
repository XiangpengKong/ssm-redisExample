package JdkProxyExample.责任链模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by KING on 2017/9/22.
 */
public interface Interceptor   {
    public boolean before(Object proxy,Object target,Method method,Object[] args);
    public void around(Object proxy,Object target,Method method,Object[] args);
    public void after(Object proxy,Object target,Method method,Object[] args);
}
