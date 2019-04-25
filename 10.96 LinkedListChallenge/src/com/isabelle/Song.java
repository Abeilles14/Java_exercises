/*
 * song class has Title and duration for a song
 */
package com.isabelle;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String toString(){
        return getTitle() +" - " +getDuration();
    }
}
