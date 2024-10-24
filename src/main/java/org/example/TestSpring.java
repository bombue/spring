package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(firstMusicPlayer.playMusic(Music.Genres.CLASSIC));
//        MusicPlayer secondMusicPlauer = context.getBean("musicPlayer", MusicPlayer.class);
//        secondMusicPlauer.setName("dddd");
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlauer.getName());
//        System.out.println(secondMusicPlauer.getVolume());
//
//        System.out.println(secondMusicPlauer.playMusic(MusicPlayer.Genres.CLASSIC));

//        Music music = context.getBean("someRockMusic", Music.class);
//        System.out.println(music.getSong());
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        context.close();
    }

}
