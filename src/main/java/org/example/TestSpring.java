package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(firstMusicPlayer.playMusic(MusicPlayer.Genres.ROCK));
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
