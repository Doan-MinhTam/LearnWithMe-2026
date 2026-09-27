import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Showtime {
    private final Movie movie;
    private final LocalDateTime showtime;
    private final List<Seat> seats;
    private static final int NUM_ROWS = 5;
    private static final int SEATS_PER_ROW = 8;

    public Showtime(Movie movie, LocalDateTime showtime) {
        this.movie = movie;
        this.showtime = showtime;
        this.seats = new ArrayList<>();
        for (char row = 'A'; row < 'A' + NUM_ROWS; row++) {
            for (int num = 1; num <= SEATS_PER_ROW; num++) {
                seats.add(new Seat(row + "" + num));
            }
        }
    }
    
    public LocalDateTime getShowtime(){
        return showtime;
    }

    /**
     * Trả về sơ đồ ghế dưới dạng chuỗi.
     */
    public String getSeatMap() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sơ đồ ghế: ").append(movie.getTitle()).append(" - ").append(getFormattedShowtime()).append("\n");
        for (int i = 0; i < seats.size(); i++) {
            sb.append(seats.get(i).toString()).append(" ");
            if ((i + 1) % SEATS_PER_ROW == 0) sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * [BÀI TẬP] Tìm ghế dựa trên mã ghế.
     * @return Đối tượng Seat nếu thấy, ngược lại trả về null.
     */
    public Seat findSeat(String seatNumber) {
        // TODO: Sinh viên duyệt danh sách seats và so sánh mã ghế (không phân biệt hoa thường)
        return null;
    }

    public Movie getMovie() { return movie; }
    public String getFormattedShowtime() {
        return showtime.format(DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy"));
    }
}