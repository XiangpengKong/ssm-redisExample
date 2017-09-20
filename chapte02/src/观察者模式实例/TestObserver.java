package 观察者模式实例;

/**
 * Created by KING on 2017/9/14.
 */
public class TestObserver {
    public static void main(String[] args) {
        ProductList observer = ProductList.getInstance();
        JDObserver jdObserver = new JDObserver();
        TanMaoObserver tanMaoObserver = new TanMaoObserver();
        observer.addProductListObserver(jdObserver);
        observer.addObserver(tanMaoObserver);
        observer.addProduct("充电宝");
    }
}
