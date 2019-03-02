package com.designpattern.proxyPattern.staticProxy;

import org.junit.Test;

/**
 * 测试静态代理
 *
 * @author zt1994 2019/3/2 16:30
 */
public class staticProxyTest {

    /**
     * 测试静态代理
     */
    @Test
    public void testStaticProxy() {
        SayHelloImpl sayHello = new SayHelloImpl();
        sayHello.sayHelloWorld();

        SayHelloProxy sayHelloProxy = new SayHelloProxy(sayHello);
        sayHelloProxy.sayHelloWorld();
    }
}
