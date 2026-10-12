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
    }

    public void append(Song song) {
        /* TODO */
    }

    public int size() {
        /* TODO */
    }

    public Song songAt(int index) {
        /* TODO */
    }

    public void remove(Song song) {
        /* TODO */
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

    public List<Song> sortDurationDecreasing() { /* TODO */ }
    public List<Song> sortReleaseYearIncreasing() { /* TODO */ }
    public List<Song> sortReleaseYearDecreasing() { /* TODO */ }
    public List<Song> sortSongsByTitle() { /* TODO */ }

    public List<Song> filterSongsLongerThan(int seconds) { /* TODO */ }
    public List<Song> filterSongsByGenre(String genre) { /* TODO */ }
    public List<Song> filterSongsByArtist(String artist) { /* TODO */ }

    // trả về dạng "[title1, title2, title3]"
    public String idOfSongsToString(List<Song> list) { /* TODO */ }

    public void print(List<Song> list) { /* TODO */ }
}