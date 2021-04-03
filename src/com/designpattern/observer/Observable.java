package com.designpattern.observer;

/**
 * 被观察者接口 Observable
 *
 * @author zhongtao on 2018/9/10
 */
public interface Observable {

    /**
     * 添加观察者
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
