package com.designpattern.singleton;

/**
 * 懒汉模式
 *
 * @author zhongtao on 2018/9/11
 */
public class Singleton2 {
    //1.私有化构造方法
    private Singleton2(){

    }
    //2.声明类的唯一实例化对象，使用private static修饰
    private static Singleton2 instance;

    //3.提供一个获取实例对象的方法，用public static修饰
    public static Singleton2 getInstance(){
        //需要判断实例是否为空，为空则创建一个实例，否则返回实例
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
