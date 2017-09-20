package JdkProxyExample.拦截器;

import java.lang.reflect.Method;

/**
 * Created by KING on 2017/9/14.
 */
public interface Interceptor {
    /**
     * 定义拦截器接口
     * before 方法返回 boolean 值，它在真实对象前调用。true 返回真实对象 false 调用 around 方法 false 调用after 方法
     * @param proxy 代理对象
     * @param target 真实对象
     * @param method 方法
     * @param args 运行方法参数
     * @return
     */
    public boolean before(Object proxy, Object target, Method method,Object[] args);
    public void around(Object proxy, Object target, Method method,Object[] args);
    public void after(Object proxy, Object target, Method method,Object[] args);
}
