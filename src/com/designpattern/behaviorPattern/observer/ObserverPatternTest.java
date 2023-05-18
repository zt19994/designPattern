package com.designpattern.behaviorPattern.observer;

import org.junit.Test;

/**
 * 观察者模式测试类
 *
 * @author zhongtao on 2018/9/10
 */
public class ObserverPatternTest {

    /**
     * 测试观察者模式
     */
    @Test
    public void testObserverPattern() {
        ConcreteObservable observable = new ConcreteObservable();

        User peter = new User("Peter");
        User make = new User("Make");
        User lina = new User("Lina");

        //添加观察者
        observable.addObserver(peter);
        observable.addObserver(make);
        observable.addObserver(lina);
        observable.setNotifyMessage("星际争霸2中人族太IMBA");

        System.out.println("-----分割线-----");
        observable.removeObserver(peter);
        observable.setNotifyMessage("星灵才是最IMBA的！");
    }
}
