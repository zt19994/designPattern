package com.designpattern.adapterPattern.playerAdapter;

/**
 * @author zhongtao on 2018/12/3
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vic file. Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
