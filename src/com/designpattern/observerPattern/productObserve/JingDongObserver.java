package com.designpattern.observerPattern.productObserve;

import java.util.Observable;
import java.util.Observer;

/**
 * 京东电商接口 观察者
 *
 * @author zt1994 2019/3/4 23:08
 */
public class JingDongObserver implements Observer {
    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.out.println("发送新产品" + newProduct + "同步到京东商城");
    }
}
