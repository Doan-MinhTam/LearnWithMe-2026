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
    public static void init() {
        /* TODO */
        for (String trimData : RAW_DATA) {
            String[] parts = trimData.split(",");

            String title = parts[0];
            String artist = parts[1];
            String genre = parts[2];
            int durationSec = Integer.parseInt(parts[3]);
            int releaseYear = Integer.parseInt(parts[4]);

            Song song = new Song(title, artist, genre, durationSec, releaseYear);
            SongManager.getInstance().append(song);
        }

    }

    public static void testOriginalData() {
        System.out.println("=== Danh sách gốc ===");
        SongManager.getInstance().print(SongManager.getInstance().getSongList());
    }

    public static void testSortDurationIncreasing() {
        /* TODO */
        System.out.println("=== Test hàm sortDurationIncreasing ===");
        SongManager.getInstance().print(SongManager.getInstance().sortDurationIncreasing());
    }
    public static void testSortDurationDecreasing() {
        /* TODO */
        System.out.println("=== Test hàm sortDurationDecreasing ===");
        SongManager.getInstance().print(SongManager.getInstance().sortDurationDecreasing());
    }
    public static void testSortReleaseYearIncreasing() {
        /* TODO */
        System.out.println("=== Test hàm sortReleaseYearIncreasing ===");
        SongManager.getInstance().print(SongManager.getInstance().sortReleaseYearIncreasing());
    }
    public static void testSortReleaseYearDecreasing() { /* TODO */
        System.out.println("=== Test hàm sortReleaseYearDecreasing ===");
        SongManager.getInstance().print(SongManager.getInstance().sortReleaseYearDecreasing());
    }
    public static void testSortSongsByTitle() { /* TODO */
        System.out.println("=== Test hàm sortSongsByTitle ===");
        SongManager.getInstance().print(SongManager.getInstance().sortSongsByTitle());
    }
    public static void testFilterSongsLongerThan180() { /* TODO — gọi filterSongsLongerThan(180) */
        System.out.println("=== Test hàm filterSongsLongerThan ===");
        SongManager.getInstance().print(SongManager.getInstance().filterSongsLongerThan(180));
    }
    public static void testFilterSongsByGenrePop() { /* TODO */
        System.out.println("=== Test hàm filterSongsByGenre ===");
        SongManager.getInstance().print(SongManager.getInstance().filterSongsByGenre("Pop"));
    }
    public static void testFilterSongsByArtistEdSheeran() { /* TODO */
        System.out.println("=== Test hàm filterSongsByArtist ===");
        SongManager.getInstance().print(SongManager.getInstance().filterSongsByArtist("Ed Sheeran"));
    }

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