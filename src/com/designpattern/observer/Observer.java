package com.designpattern.observer;

/**
 * 观察者接口 Observer
 *
 * @author zhongtao on 2018/9/10
 */
public interface Observer {

    /**
     * 更新消息
     */
    void update(String message);
}
