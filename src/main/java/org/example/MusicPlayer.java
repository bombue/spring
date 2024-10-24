package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {};

    public void playMusic(){
        musicList.forEach(music -> System.out.println("Playing: "+music.getSong()));
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
