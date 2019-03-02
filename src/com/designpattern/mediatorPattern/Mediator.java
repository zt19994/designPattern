package com.designpattern.mediatorPattern;

/**
 * 抽象中介类
 *
 * @author zhongtao on 2018/12/19
 */
public abstract class Mediator {

    public abstract void contact(String content, Colleague colleague);
}
