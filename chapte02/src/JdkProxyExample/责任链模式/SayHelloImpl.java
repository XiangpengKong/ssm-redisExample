package JdkProxyExample.责任链模式;

/**
 * Created by KING on 2017/9/22.
 */
public class SayHelloImpl implements SayHello {
    @Override
    public void hello() {
        System.out.println("Hello World!!!");
    }

    @Override
    public void say(String str) {
        System.out.println("您要说的是：" + str);
    }
}
