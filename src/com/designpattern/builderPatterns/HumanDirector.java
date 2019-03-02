package com.designpattern.builderPatterns;

/**
 * 管理造人的顺序 BuilderHuman不同，则创建的人不同
 * @author zhongtao on 2018/9/17
 */
public class HumanDirector {

    public Human createHumanByDirector(BuilderHuman builderHuman){
        builderHuman.buildHead();
        builderHuman.buildBody();
        builderHuman.buildHand();
        builderHuman.buildFoot();

        return builderHuman.createHuman();
    }
}
