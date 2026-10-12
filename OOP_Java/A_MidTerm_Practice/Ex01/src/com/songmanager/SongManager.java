package com.songmanager;

import java.util.*;

public class SongManager {
    private static SongManager instance;
    private List<Song> songList;

    private SongManager() {
        songList = new ArrayList<>();
    }

    public static SongManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new SongManager();
        }
        return instance;
    }

    public void append(Song song) {
        /* TODO */
        songList.add(song);
    }

    public int size() {
        /* TODO */
        return songList.size();
    }

    public Song songAt(int index) {
        /* TODO */
        return songList.get(index);
    }

    public void remove(Song song) {
        /* TODO */
        songList.remove(song);
    }

    public List<Song> getSongList() {
        return songList;
    }

    // --- Mẫu đã cho sẵn — dùng làm khuôn cho các hàm sort còn lại ---
    public List<Song> sortDurationIncreasing() {
        List<Song> result = new ArrayList<>(songList);
        result.sort(Comparator.comparingInt(Song::getDurationSec));
        return result;
    }

    public List<Song> sortDurationDecreasing() {
        /* TODO */
        ArrayList<Song> songs = new ArrayList<>(songList);
        songs.sort(Comparator.comparing(Song::getDurationSec).reversed());
        return songs;

    }
    public List<Song> sortReleaseYearIncreasing() {
        /* TODO */
        ArrayList<Song> songs = new ArrayList<>(songList);
        songs.sort(Comparator.comparing(Song::getReleaseYear));
        return songs;

    }
    public List<Song> sortReleaseYearDecreasing() {
        /* TODO */
        ArrayList<Song> songs = new ArrayList<>(songList);
        songs.sort(Comparator.comparing(Song::getReleaseYear).reversed());
        return songs;
    }
    public List<Song> sortSongsByTitle() {
        /* TODO */
        ArrayList<Song> songs = new ArrayList<>(songList);
        songs.sort(Comparator.comparing(Song::getTitle));
        return songs;
    }

    public List<Song> filterSongsLongerThan(int seconds) {
        /* TODO */
        ArrayList<Song> songs = new ArrayList<>();
        for (Song song : songList){
            if (song.getDurationSec() > seconds) {
                songs.add(song);
            }
        }
        return songs;

    }
    public List<Song> filterSongsByGenre(String genre) {
        /* TODO */
        ArrayList<Song> songs = new ArrayList<>();
        for (Song song : songList){
            if (song.getGenre().equalsIgnoreCase(genre)) {
                songs.add(song);
            }
        }
        return songs;
    }
    public List<Song> filterSongsByArtist(String artist) {
        /* TODO */
        ArrayList<Song> songs = new ArrayList<>();
        for (Song song : songList){
            if (song.getArtist().equalsIgnoreCase(artist)) {
                songs.add(song);
            }
        }
        return songs;
    }

    // trả về dạng "[title1, title2, title3]"
    public String idOfSongsToString(List<Song> list) {
        /* TODO */
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Song song : list) {
            if (count == list.size() - 1) {
                stringBuilder.append(song.getTitle()).append("]");
                break;
            }
            stringBuilder.append(song.getTitle()).append(", ");
            count++;
        }
        return stringBuilder.toString();
    }

    public void print(List<Song> list) {
        /* TODO */
        for (Song song : list) {
            System.out.println(song.toString());
        }
    }
}