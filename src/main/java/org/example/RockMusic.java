package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class RockMusic implements Music{

    private final Random rand = new Random();
    private List<String> songs;
    @Override
    public String getSong() {
//        return songs.get(rand.nextInt(songs.size()));
        return "rock1";
    }
}
