package com.designpattern.proxyPattern.staticProxy;

/**
 * 代理对象
 *
 * @author zt1994 2019/3/2 16:28
 */
public class SayHelloProxy implements SayHello {

    private SayHello sayHello;

    public SayHelloProxy(SayHello sayHello) {
        this.sayHello = sayHello;
    }

    @Override
    public void sayHelloWorld() {
        System.out.println("调用sayHello之前的处理");
        sayHello.sayHelloWorld();
        System.out.println("调用sayHello之后的处理");
    }
}
