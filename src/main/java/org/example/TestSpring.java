package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();
        MusicPlayer secondMusicPlauer = context.getBean("musicPlayer", MusicPlayer.class);
        secondMusicPlauer.setName("dddd");
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlauer.getName());
        System.out.println(secondMusicPlauer.getVolume());
        context.close();
    }

}
