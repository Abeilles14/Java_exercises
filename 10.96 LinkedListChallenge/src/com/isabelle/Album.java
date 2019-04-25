/*
 * contains a list of songs, albums stored in array list
 * songs from different albums can be added to playlist linked list
 */
package com.isabelle;


import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album (String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(String name, double duration){
        Song newSong = new Song(name, duration);
        if (findSong(name) == null){
            songs.add(newSong);
        } else {
            System.out.println("Song already exists in album");
        }
    }

    private Song findSong (String name){
        for (int i=0; i<songs.size(); i++){
            if (songs.get(i).getTitle().equals(name)){
                return songs.get(i);
            }
        }
        return null;
    }

    public void addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;                                             //arrays start from 0, tracks start from 1
        if (index < 0 || index > songs.size()) {
            System.out.println("This album does not have a track " +trackNumber);
        } else {
            playlist.add(songs.get(index));
            System.out.println("Song added to playlist");
        }
    }

    public void addToPlaylist(String name, LinkedList<Song> playlist) {
        Song song = findSong(name);
        if (findSong(name) == null){
            System.out.println("This album does not have the song "+name);
        } else {
            playlist.add(song);
            System.out.println("Song added to playlist");
        }
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }
}
