import javax.management.modelmbean.ModelMBeanConstructorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class MovieCollection - Quản lý bộ sưu tập phim
 * <p>
 * Mô tả:
 * - Class này quản lý bộ sưu tập phim sử dụng ArrayList
 * - Cần implements interface IMovieCollection
 * - Sử dụng Collections.sort() với Comparable và Comparator
 * <p>
 * Thuộc tính:
 * - movies: List<IMovie> - Danh sách phim (sử dụng ArrayList)
 * <p>
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo ArrayList rỗng
 * 2. Implement các methods:
 * - addMovie(): Thêm phim
 * - removeMovie(): Xóa phim theo ID
 * - getMovie(): Lấy phim theo ID
 * - getAllMovies(): Trả về List tất cả phim
 * - getTotalMovies(): Trả về tổng số phim
 * - sortByNaturalOrder(): Sắp xếp theo thứ tự tự nhiên (dùng Comparable - rating giảm dần)
 * - sortByRating(): Sắp xếp theo rating tăng dần (dùng MovieComparators.byRating)
 * - sortByYear(): Sắp xếp theo year tăng dần (dùng MovieComparators.byYear)
 * - sortByTitle(): Sắp xếp theo title A-Z (dùng MovieComparators.byTitle)
 * - sortByDuration(): Sắp xếp theo duration tăng dần (dùng MovieComparators.byDuration)
 * - sortByGenreThenRating(): Sắp xếp theo genre rồi rating (dùng MovieComparators)
 * - getMoviesByGenre(): Lấy phim theo thể loại
 * - getMoviesByDirector(): Lấy phim theo đạo diễn
 * - getAverageRating(): Tính rating trung bình
 * - getTopRatedMovies(): Lấy phim có rating >= minRating
 * 3. Override toString() để in danh sách phim
 * <p>
 * LƯU Ý:
 * - Sử dụng Collections.sort() để sắp xếp
 * - Các method sort phải tạo copy của list trước khi sort (không thay đổi list gốc)
 */
class MovieCollection implements IMovieCollection {
    // TODO: Khai báo thuộc tính
    private List<IMovie> iMovieList;
    // TODO: Tạo constructor

    public MovieCollection() {
        this.iMovieList = new ArrayList<>();
    }

    // TODO: Implement các methods từ interface
    // CHÚ Ý: Các method sort phải dùng Collections.sort() với Comparable hoặc Comparator

    @Override
    public boolean addMovie(IMovie movie) {
        if (iMovieList.contains(movie)) {
            return false;
        }
        iMovieList.add(movie);
        return true;
    }

    @Override
    public boolean removeMovie(String movieId) {
        for (IMovie movie : iMovieList) {
            if (movie.getMovieId().equals(movieId)) {
                iMovieList.remove(movie);
                return true;
            }
        }
        return false;
    }

    @Override
    public IMovie getMovie(String movieId) {
        for (IMovie movie : iMovieList) {
            if (movie.getMovieId().equals(movieId)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public List<IMovie> getAllMovies() {
        return iMovieList;
    }

    @Override
    public int getTotalMovies() {
        return iMovieList.size();
    }

    @Override
    public List<IMovie> sortByNaturalOrder() {
        List<IMovie> copy = new ArrayList<>(iMovieList);
        copy.sort(Comparator.comparing(IMovie::getRating).reversed());
        return copy;
    }

    private List<IMovie> sortWith(Comparator<IMovie> comparator) {
        List<IMovie> copy = new ArrayList<>(iMovieList);
        Collections.sort(copy, comparator);
        return copy;
    }

    @Override
    public List<IMovie> sortByRating() {
        return sortWith(MovieComparators.byRating);
    }

    @Override
    public List<IMovie> sortByYear() {
        return sortWith(MovieComparators.byYear);
    }

    @Override
    public List<IMovie> sortByTitle() {
        return sortWith(MovieComparators.byTitle);
    }

    @Override
    public List<IMovie> sortByDuration() {
        return sortWith(MovieComparators.byDuration);
    }

    @Override
    public List<IMovie> sortByGenreThenRating() {
        return sortWith(MovieComparators.byGenreThenRating);
    }

    @Override
    public List<IMovie> getMoviesByGenre(String genre) {
        List<IMovie> results = new ArrayList<>();
        for (IMovie mv : iMovieList) {
            if (mv.getGenre().equals(genre)) {
                results.add(mv);
            }
        }
        return results;
    }

    @Override
    public List<IMovie> getMoviesByDirector(String director) {
        List<IMovie> results = new ArrayList<>();
        for (IMovie mv : iMovieList) {
            if (mv.getDirector().equals(director)) {
                results.add(mv);
            }
        }
        return results;
    }

    @Override
    public double getAverageRating() {
        double totalRating = 0.0;
        for (IMovie mv : iMovieList) {
            totalRating += mv.getRating();
        }
        return totalRating / iMovieList.size();
    }

    @Override
    public List<IMovie> getTopRatedMovies(double minRating) {
        List<IMovie> results = new ArrayList<>();
        for (IMovie mv : iMovieList) {
            if (mv.getRating() >= minRating) {
                results.add(mv);
            }
        }
        return results;
    }

    // TODO: Override toString()
}