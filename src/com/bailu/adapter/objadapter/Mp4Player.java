package com.bailu.adapter.objadapter;

/**
 * @Author: JasonD
 * @date: 2023/9/3 20:31
 * @Description:
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file. name: " + fileName);
    }
}
