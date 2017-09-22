package JdkProxyExample.拦截器;

import JdkProxyExample.HelloWord;
import JdkProxyExample.HelloWordImpl;

/**
 * Created by KING on 2017/9/14.
 */
public class TestInterceptor {
    public static void main(String[] args) {
        HelloWord proxy = (HelloWord)InterceptorJdkProxy.bind(new HelloWordImpl(),"JdkProxyExample.拦截器.MyInterceptor");
        proxy.say("就是这么难！");
    }
}
