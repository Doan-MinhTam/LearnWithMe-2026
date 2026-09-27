import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private List<Movie> movies;
    private List<Showtime> showtimes;

    public Cinema(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.showtimes = new ArrayList<>();
    }

    public void addMovie(Movie movie) { movies.add(movie); }
    public void addShowtime(Showtime showtime) { showtimes.add(showtime); }

    /**
     * Trả về danh sách các phim dưới dạng chuỗi.
     */
    public String getMoviesInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Danh sách phim tại ").append(name).append(":\n");
        for (int i = 0; i < movies.size(); i++) {
            sb.append((i + 1)).append(". ").append(movies.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Tìm các suất chiếu cho một bộ phim.
     */
    public List<Showtime> findShowtimesForMovie(Movie movie) {
        List<Showtime> availableShowtimes = new ArrayList<>();
        for (Showtime st : showtimes) {
            if (st.getMovie().equals(movie)) {
                availableShowtimes.add(st);
            }
        }
        return availableShowtimes;
    }

    /**
     * [BÀI TẬP] Xử lý logic đặt vé cho một suất chiếu.
     * 
     * @param showtime Suất chiếu khách hàng chọn.
     * @param seatNumbers Danh sách mã ghế (ví dụ: ["C4", "C5"]).
     * @return Đối tượng Ticket nếu thành công, trả về null nếu thất bại.
     * 
     * Yêu cầu logic (Tất cả hoặc không có gì):
     * 1. Duyệt qua seatNumbers, dùng showtime.findSeat(seatNum) để tìm đối tượng Seat.
     * 2. Nếu bất kỳ ghế nào không tồn tại (null) hoặc đã được đặt (isBooked()), trả về null ngay lập tức.
     * 3. Nếu tất cả ghế đều hợp lệ, thực hiện gọi hàm book() cho từng ghế đó.
     * 4. Tạo và trả về đối tượng Ticket mới. Không thực hiện in thông báo trong hàm này.
     */
    public Ticket bookTickets(Showtime showtime, List<String> seatNumbers) {
        // TODO: Sinh viên triển khai logic tại đây
        List<Seat> bookedSeats = new ArrayList<>();

        for (String seatNumber : seatNumbers) {
            Seat seat = showtime.findSeat(seatNumber);

            if (seat == null || seat.isBooked()) {
                return null;
            }

            bookedSeats.add(seat);
        }

        for (Seat seat : bookedSeats) {
            seat.book();
        }

        return new Ticket(showtime, bookedSeats);
    }

    public List<Movie> getMovies() { return movies; }
    public List<Showtime> getShowtimes() { return showtimes; }
    public String getName() { return name; }
}