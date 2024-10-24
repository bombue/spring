package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("someRockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

//    public MusicPlayer() {};

    public String  playMusic(Music.Genres genre){
//        musicList.forEach(music -> System.out.println("Playing: "+music.getSong()));
//        System.out.println("Playing: "+classicalMusic.getSong());
//        System.out.println("Playing: "+rockMusic.getSong());
        if (genre.equals(Music.Genres.CLASSIC)) {
            return "Playing: "+music2.getSong();
        } else if (genre.equals(Music.Genres.ROCK)) {
            return "Playing: "+music1.getSong();
        } else {
            return "wrong genre";
        }
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

//    public List<Music> getMusicList() {
//        return musicList;
//    }

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

}
