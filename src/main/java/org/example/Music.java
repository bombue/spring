package org.example;

public interface Music {
    enum Genres {
        CLASSIC,
        ROCK,
        POP;
    }
    String getSong();
}
