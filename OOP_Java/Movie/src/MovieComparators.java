import java.util.Comparator;

/**
 * Class MovieComparators - Chứa các Comparator để sắp xếp
 * 
 * Mô tả:
 * - Class này chứa các static Comparator để sắp xếp Movie theo nhiều cách khác nhau
 * 
 * Yêu cầu:
 * Tạo các static Comparator sau:
 * 
 * 1. byRating: Comparator<IMovie>
 *    - Sắp xếp theo rating TĂNG DẦN (từ thấp đến cao)
 * 
 * 2. byYear: Comparator<IMovie>
 *    - Sắp xếp theo year TĂNG DẦN (phim cũ trước, mới sau)
 *    - Nếu year bằng nhau thì theo title (A-Z)
 * 
 * 3. byTitle: Comparator<IMovie>
 *    - Sắp xếp theo title (A-Z, alphabetically)
 * 
 * 4. byDuration: Comparator<IMovie>
 *    - Sắp xếp theo duration TĂNG DẦN (phim ngắn trước)
 * 
 * 5. byGenreThenRating: Comparator<IMovie>
 *    - Sắp xếp theo genre (A-Z) trước
 *    - Nếu genre giống nhau thì theo rating GIẢM DẦN
 */
class MovieComparators {
    // TODO: Tạo Comparator byRating (rating tăng dần)
    public static final Comparator<IMovie> byRating =
            (a,b) -> Double.compare(a.getRating(), b.getRating());
    // TODO: Tạo Comparator byYear (year tăng dần, nếu bằng thì theo title)
    public static final Comparator<IMovie> byYear = (a, b) -> {
        int cmp = Integer.compare(a.getYear(), b.getYear());
        if (cmp != 0) {
            return cmp;
        }
        return a.getTitle().compareTo(b.getTitle());
    };
    // TODO: Tạo Comparator byTitle (title A-Z)
    public static final Comparator<IMovie> byTitle =
            (a,b) -> a.getTitle().compareTo(b.getTitle());
    // TODO: Tạo Comparator byDuration (duration tăng dần)
    public static final Comparator<IMovie> byDuration =
            (a, b) -> Integer.compare(a.getDuration(), b.getDuration());
    // TODO: Tạo Comparator byGenreThenRating (genre A-Z, rồi rating giảm dần)
    public static final Comparator<IMovie> byGenreThenRating =
            Comparator.comparing(IMovie::getGenre)
                    .thenComparing(Comparator.comparing(IMovie::getRating).reversed());
}
