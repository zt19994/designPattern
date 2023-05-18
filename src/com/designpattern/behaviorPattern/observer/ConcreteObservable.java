package com.designpattern.behaviorPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者
 *
 * @author zhongtao on 2018/9/10
 */
public class ConcreteObservable implements Observable {

    // 用来存储观察者对象的集合
    private List<Observer> list = new ArrayList<Observer>();

    //消息
    private String message;

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    /**
     * 设置更新消息
     * @param message
     */
    public void setNotifyMessage(String message){
        this.message = message;
        System.out.println("更新消息：" + message);
        notifyObserver();
    }
}
