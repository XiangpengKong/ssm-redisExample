package 反射;

import java.lang.reflect.Method;

/**
 * Created by KING on 2017/9/20.
 */
public class Test {

    public static void main(String[] args) {
        Test.getInstance();
    }

    public static SayHello getInstance(){
        SayHello object = null;
        try {
            object = (SayHello) Class.forName("反射.SayHello").newInstance();
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object,"张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }


}
