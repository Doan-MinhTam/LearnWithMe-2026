/**
 * Class Movie - Đại diện cho một bộ phim
 * 
 * Mô tả:
 * - Class này đại diện cho một bộ phim trong bộ sưu tập
 * - Cần implements interface IMovie
 * - Cần implements Comparable<IMovie> để sắp xếp tự nhiên theo rating (giảm dần)
 * 
 * Thuộc tính:
 * - movieId: String - Mã phim (unique)
 * - title: String - Tên phim
 * - director: String - Đạo diễn
 * - year: int - Năm phát hành
 * - rating: double - Đánh giá (0.0 - 10.0)
 * - genre: String - Thể loại phim
 * - duration: int - Thời lượng (phút)
 * 
 * Yêu cầu:
 * 1. Tạo constructor với đầy đủ 7 tham số
 * 2. Implement tất cả methods từ interface IMovie
 * 3. Implement Comparable<IMovie>:
 *    - compareTo() sắp xếp theo rating GIẢM DẦN (phim rating cao hơn đứng trước)
 *    - Nếu rating bằng nhau thì so sánh theo year (mới hơn đứng trước - giảm dần)
 * 4. Override toString() để in thông tin phim theo format:
 *    "Movie[id='<id>', title='<title>', director='<dir>', year=<year>, rating=<rat>, genre='<gen>', duration=<dur>min]"
 */
class Movie implements IMovie, Comparable<IMovie> {
    // TODO: Khai báo các thuộc tính
    private String movieId;
    private String title;
    private String director;
    private int year;
    private double rating;
    private String genre;
    private int duration;
    // TODO: Tạo constructor

    public Movie(String movieId, String title, String director, int year, double rating, String genre, int duration) {
        this.movieId = movieId;
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        this.duration = duration;
    }

    // TODO: Implement các methods từ interface

    @Override
    public String getMovieId() {
        return movieId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    // TODO: Implement compareTo() - Sắp xếp theo rating giảm dần, rồi year giảm dần

    @Override
    public int compareTo(IMovie other) {
        int cmp = Double.compare(other.getRating(), this.rating);
        if (cmp != 0) {
            return cmp;
        }
        return Integer.compare(other.getYear(), this.year);
    }

    // TODO: Override toString()

    @Override
    public String toString() {
        return "Movie[id='"+movieId+"', title='"+title+"', director='"+director+"', year="+year+", rating="+rating+", genre='"+genre+"', duration="+duration+"min]";
    }
}
