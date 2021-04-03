package com.designpattern.builder;

/**
 * 造人接口 规定造人的规范 需要头、身体、手、脚
 *
 * @author zhongtao on 2018/9/17
 */
public interface BuilderHuman {

    void buildHead();

    void buildBody();

    void buildHand();

    void buildFoot();

    /**
     * 返回创建的对象
     */
    Human createHuman();

}
