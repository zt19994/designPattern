package com.designpattern.adapter.playeradapter;

/**
 * @author zhongtao on 2018/12/3
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing map4 file. Name:" + fileName);
    }
}
