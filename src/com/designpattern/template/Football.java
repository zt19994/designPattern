package com.designpattern.template;

/**
 * Football实体类
 *
 * @author zt1994 2021/4/3 15:43
 */
public class Football extends AbstractGame {

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
