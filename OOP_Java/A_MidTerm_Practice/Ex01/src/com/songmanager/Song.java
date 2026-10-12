package com.songmanager;

public class Song {
    private String title;
    private String artist;
    private String genre;
    private int durationSec;
    private int releaseYear;

    public Song(String title, String artist, String genre, int durationSec, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.durationSec = durationSec;
        this.releaseYear = releaseYear;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }
    public int getDurationSec() { return durationSec; }
    public int getReleaseYear() { return releaseYear; }

    @Override
    public String toString() {
        return title + " - " + artist + " [" + genre + ", " + durationSec + "s, " + releaseYear + "]";
    }
}