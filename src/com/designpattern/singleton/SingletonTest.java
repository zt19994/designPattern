package com.designpattern.singleton;

import org.junit.Test;

/**
 * 饿汉模式测试
 *
 * @author zhongtao on 2018/9/11
 */
public class SingletonTest {

    /**
     * 测试饿汉模式
     */
    @Test
    public void testSingleton() {
        //调用singleton的静态实例
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); //相等，为饿汉单例模式
    }
}
