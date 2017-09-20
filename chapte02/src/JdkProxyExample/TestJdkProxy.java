package JdkProxyExample;

/**
 * Created by KING on 2017/9/13.
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWord proxy = (HelloWord) jdk.bind(new HelloWordImpl());
        proxy.sayHello();
        proxy.say("一切才刚刚开始！");
    }
}
