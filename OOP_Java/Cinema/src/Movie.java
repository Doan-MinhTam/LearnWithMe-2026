/**
 * Lớp Movie đại diện cho một bộ phim.
 * Chứa các thông tin cơ bản về phim.
 */
public class Movie {
    private String title;
    private String genre;
    private int durationInMinutes;

    /**
     * Hàm khởi tạo cho một Movie.
     * @param title Tiêu đề phim.
     * @param genre Thể loại phim.
     * @param durationInMinutes Thời lượng phim (phút).
     */
    public Movie(String title, String genre, int durationInMinutes) {
        this.title = title;
        this.genre = genre;
        this.durationInMinutes = durationInMinutes;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     * Trả về một chuỗi mô tả thông tin của phim.
     * @return Chuỗi thông tin.
     */
    @Override
    public String toString() {
        return String.format("Phim: %s (%s, %d phút)", title, genre, durationInMinutes);
    }
}