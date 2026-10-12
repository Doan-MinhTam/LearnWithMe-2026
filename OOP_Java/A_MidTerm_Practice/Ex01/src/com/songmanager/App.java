package com.songmanager;

public class App {
    private static final String[] RAW_DATA = {
            "Perfect,Ed Sheeran,Pop,263,2017",
            "Bohemian Rhapsody,Queen,Rock,355,1975",
            "Blinding Lights,The Weeknd,Pop,200,2019",
            "Hotel California,Eagles,Rock,391,1976",
            "Shape of You,Ed Sheeran,Pop,233,2017",
            "Billie Jean,Michael Jackson,Pop,294,1982",
            "Smells Like Teen Spirit,Nirvana,Rock,301,1991",
            "Rolling in the Deep,Adele,Soul,228,2010",
            "Lose Yourself,Eminem,Hip Hop,326,2002",
            "Someone Like You,Adele,Soul,285,2011",
            "Bad Guy,Billie Eilish,Pop,194,2019",
            "Stairway to Heaven,Led Zeppelin,Rock,482,1971"
    };

    // tách mỗi dòng của RAW_DATA bằng dấu phẩy, tạo Song, add vào SongManager.getInstance()
    public static void init() { /* TODO */ }

    public static void testOriginalData() {
        System.out.println("=== Danh sách gốc ===");
        SongManager.getInstance().print(SongManager.getInstance().getSongList());
    }

    public static void testSortDurationIncreasing() { /* TODO */ }
    public static void testSortDurationDecreasing() { /* TODO */ }
    public static void testSortReleaseYearIncreasing() { /* TODO */ }
    public static void testSortReleaseYearDecreasing() { /* TODO */ }
    public static void testSortSongsByTitle() { /* TODO */ }
    public static void testFilterSongsLongerThan180() { /* TODO — gọi filterSongsLongerThan(180) */ }
    public static void testFilterSongsByGenrePop() { /* TODO */ }
    public static void testFilterSongsByArtistEdSheeran() { /* TODO */ }

    public static void main(String[] args) {
        init();
        testOriginalData();
        testSortDurationIncreasing();
        testSortDurationDecreasing();
        testSortReleaseYearIncreasing();
        testSortReleaseYearDecreasing();
        testSortSongsByTitle();
        testFilterSongsLongerThan180();
        testFilterSongsByGenrePop();
        testFilterSongsByArtistEdSheeran();
    }
}