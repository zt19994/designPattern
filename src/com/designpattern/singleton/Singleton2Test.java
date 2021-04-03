package com.designpattern.singleton;

import org.junit.Test;

/**
 * 懒汉模式测试
 * @author zhongtao on 2018/9/11
 */
public class Singleton2Test {
    
    /**
     * 测试懒汉模式
     */
    @Test
    public void testSingleton2(){
        //调用singleton2的静态实例
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        System.out.println(s3==s4); //相等，为懒汉单例模式
    }
}
