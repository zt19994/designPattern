package com.designpattern.proxy.dynamicproxy;

import org.junit.Test;

/**
 * 动态代理测试
 *
 * @author zt1994 2019/3/2 16:47
 */
public class DynamicProxyTest {

    /**
     * 动态代理测试
     */
    @Test
    public void testDynamicProxy() {
        JdkProxyExample jdkProxyExample = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdkProxyExample.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
    }
}
