package com.designpattern.structurePattern.adapter.playeradapter;

/**
 * @author zhongtao on 2018/12/3
 */
public class AdapterPatternTest {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
