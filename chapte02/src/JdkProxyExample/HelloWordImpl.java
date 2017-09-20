package JdkProxyExample;

/**
 * Created by KING on 2017/9/13.
 */
public class HelloWordImpl implements HelloWord {
    @Override
    public void sayHello(){
        System.out.println("Hello Word");
    }

    @Override
    public void say(String str) {
        System.out.println("您要说的是：" + str);
    }
}
