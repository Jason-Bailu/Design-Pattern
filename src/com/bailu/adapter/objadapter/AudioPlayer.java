package com.bailu.adapter.objadapter;

/**
 * @Author: JasonD
 * @date: 2023/9/3 20:34
 * @Description:
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file. name: "+ fileName);
        } else if (audioType.equalsIgnoreCase("vlc") ||
        audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media file");
        }
    }
}
