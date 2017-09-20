package 观察者模式实例;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by KING on 2017/9/14.
 */
public class ProductList extends Observable {
    private List<String> productList = null;//产品列表

    private static ProductList instance;//类唯一实例

    private ProductList(){};//私有化构造方法

    /**
     * 取得唯一实例
     * @return 产品列表唯一实例
     */
    public static ProductList getInstance(){
        if(instance == null){
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    /**
     * 增加观察者
     * @param observer 观察者
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    /**
     * 增加新产品
     * @param newProduct 新产品
     */
    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表新增加的产品为：" + newProduct);

        this.setChanged();//设置被观察对象发生变化
        this.notifyObservers(newProduct);//通知观察者，并传递新产品
    }
}
