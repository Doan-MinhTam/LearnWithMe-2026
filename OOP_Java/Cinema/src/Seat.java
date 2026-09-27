/**
 * Lớp Seat đại diện cho một ghế ngồi trong phòng chiếu.
 * Mỗi ghế có mã số và trạng thái (đã đặt hoặc còn trống).
 */
public class Seat {
    private final String seatNumber; // Ví dụ: "A1", "B5"
    private boolean isBooked;

    /**
     * Hàm khởi tạo cho một Seat.
     * @param seatNumber Mã ghế.
     */
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false; // Ban đầu ghế luôn còn trống
    }

    // Getters
    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    /**
     * Đánh dấu ghế này là đã được đặt.
     */
    public void book() {
        this.isBooked = true;
    }

    /**
     * Trả về biểu diễn chuỗi của ghế, ví dụ: [A1] nếu trống, [XX] nếu đã đặt.
     * @return Chuỗi biểu diễn trạng thái ghế.
     */
    @Override
    public String toString() {
        return isBooked ? "[XX]" : "[" + seatNumber + "]";
    }
}