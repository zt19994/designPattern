package com.designpattern.behaviorPattern.template;

/**
 * 模板设计模式 game抽象类
 *
 * @author zt1994 2021/4/3 15:41
 */
public abstract class AbstractGame {

    /**
     * 初始化游戏
     */
    abstract void initialize();

    /**
     * 开始游戏
     */
    abstract void startPlay();

    /**
     * 结束游戏
     */
    abstract void endPlay();

    /**
     * 模板 final实现
     */
    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
