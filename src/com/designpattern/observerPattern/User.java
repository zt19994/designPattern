package com.designpattern.observerPattern;

/**
 * 具体实现观察者
 *
 * @author zhongtao on 2018/9/10
 */
public class User implements Observer {

    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "你有新消息了：" + message);
    }
}
