package com.jamesgower;

        import java.util.ArrayList;

/**
 * Created by james on 20/06/2017.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration ;
    }
}
