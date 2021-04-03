package com.designpattern.template;

/**
 * Cricket实体类
 *
 * @author zt1994 2021/4/3 15:42
 */
public class Cricket extends AbstractGame {

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
