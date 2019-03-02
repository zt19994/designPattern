package com.designpattern.singletonPattern;

/**
 * 饿汉模式
 *
 * @author zhongtao on 2018/9/11
 */
public class Singleton {
    //1.将构造方法私有化，不允许外部直接创建对象
    private Singleton(){
    }
    //2.自己在类的内部创建一个实例,是唯一的，把实例设为static，静态的
    private static Singleton instance = new Singleton();

    //3.提供一个获取实例的方法
    public static Singleton getInstance() {
        return instance;
    }
}
