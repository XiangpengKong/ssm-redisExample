package 观察者模式实例;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by KING on 2017/9/14.
 */
public class TanMaoObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String)arg;
        System.out.println("发送新产品【" + newProduct + "】到天猫商城！");
    }
}
