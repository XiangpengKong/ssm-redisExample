package JdkProxyExample.拦截器.责任链模式;

import JdkProxyExample.HelloWord;
import JdkProxyExample.HelloWordImpl;
import JdkProxyExample.拦截器.InterceptorJdkProxy;

/**
 * Created by KING on 2017/9/14.
 */
public class Test {
    public static void main(String[] args) {
        HelloWord proxy1 = (HelloWord) InterceptorJdkProxy.bind(new HelloWordImpl(),"JdkProxyExample.拦截器.责任链模式.Interceptor1");
        HelloWord proxy2 = (HelloWord) InterceptorJdkProxy.bind(proxy1,"JdkProxyExample.拦截器.责任链模式.Interceptor2");
        HelloWord proxy3 = (HelloWord) InterceptorJdkProxy.bind(proxy2,"JdkProxyExample.拦截器.责任链模式.Interceptor3");
        proxy3.sayHello();
    }
}
