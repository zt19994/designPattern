package com.designpattern.proxyPattern.staticProxy;

/**
 * 真实对象
 *
 * @author zt1994 2019/3/2 16:27
 */
public class SayHelloImpl implements SayHello {

    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }
}
