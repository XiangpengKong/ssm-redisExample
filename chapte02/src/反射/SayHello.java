package 反射;

/**
 * Created by KING on 2017/9/20.
 */
public class SayHello {
    private String name;

    public void sayHello(String name){
        System.out.println("你好，"  + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
