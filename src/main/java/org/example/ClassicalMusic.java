package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{
    @Value("#{'${classicalMusicList}'.split(',')}")
    private List<String> songs;
    private final Random rand = new Random();
    private ClassicalMusic() {
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return songs.get(rand.nextInt(songs.size()));
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my Destruction");
    }
}
