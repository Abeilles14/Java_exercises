/*
 * isabelle andre
 * 10/08/18
 * linked list challenge, implements a playlist for songs
 */
package com.isabelle;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Death of a bachelor", "Panic! at the disco");
        album.addSong("Death of a bachelor", 4.6);
        album.addSong("Golden days", 4.22);
        album.addSong("Emperor's new clothes", 4.3);
        album.addSong("Impossible year", 5.6);
        albums.add(album);

        album = new Album("Back in Black", "AC/DC");
        album.addSong("Back in black", 5.44);
        album.addSong("Thunderstruck", 3.25);
        album.addSong("You shook me all night long", 3.45);
        album.addSong("Hell's Bell", 3.33);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Death of a bachelor", playlist);
        albums.get(0).addToPlaylist("Impossible year", playlist);
        albums.get(0).addToPlaylist("Not a PATD song", playlist);  // Does not exist
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist("You shook me all night long", playlist);
        albums.get(1).addToPlaylist(24, playlist);  // There is no track 24

        play(playlist);
    }

    private static void printMenu() {
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }

    public static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        int action;
        ListIterator<Song> listIterator = playlist.listIterator();
        printMenu();

        while(!quit){
            action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    quit = true;
                    System.out.println("Quit playlist");
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    forward = true;

                    if (listIterator.hasNext()){
                        System.out.println("Skipped forwards to " +listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    forward = false;

                    if(listIterator.hasPrevious()){
                        System.out.println("Skipped backwards to " +listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the beginning of the playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached the beginning of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the beginning of the playlist");
                        }
                        break;
                    }

                case 4:
                    Iterator<Song> iterator = playlist.iterator();
                    while(iterator.hasNext()){
                        System.out.println(iterator.next().toString());
                    }

                    /*
                    for (int i=0; i<playlist.size(); i++){                  //doesnt work for linkedlists
                        playlist.get(i).toString();
                    }
                    */
                    break;

                case 5:
                    printMenu();

                case 6:
                    if (playlist.size() > 0){
                        listIterator.remove();
                        System.out.println("Song removed from playlist");
                        if (listIterator.hasPrevious()){
                            System.out.println("Playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Playing " + listIterator.next().toString());
                            forward = true;
                        }
                    } else {
                        System.out.println("No songs in playlist");
                    }
                    break;
            }
        }

    }

}
