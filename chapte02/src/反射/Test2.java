package 反射;

import java.lang.reflect.Method;

/**
 * Created by KING on 2017/9/20.
 */
public class Test2 {
    public static void main(String[] args) {
        Test2.getInstance();
    }
    public static Object getInstance(){
        SayHello object = null;
        try {
            object = (SayHello) Class.forName("反射.SayHello").newInstance();
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object,"tom" );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
