package com.bailu.adapter.objadapter;

/**
 * @Author: JasonD
 * @date: 2023/9/3 20:31
 * @Description:
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file. name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
