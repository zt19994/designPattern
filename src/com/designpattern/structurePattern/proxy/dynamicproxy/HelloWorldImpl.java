package com.designpattern.structurePattern.proxy.dynamicproxy;

/**
 * 真实对象
 *
 * @author zt1994 2019/3/2 16:40
 */
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World");
    }
}
