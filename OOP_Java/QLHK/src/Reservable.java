/**
 * Interface cho đối tượng có thể đặt chỗ
 */
public interface Reservable {
    /**
     * Đặt chỗ
     * @param seatClass Hạng ghế (ECONOMY, BUSINESS, FIRST_CLASS)
     * @param numberOfSeats Số ghế cần đặt
     * @throws NoSeatsAvailableException nếu không đủ ghế
     */
    boolean reserve(String seatClass, int numberOfSeats) throws NoSeatsAvailableException;
    
    /**
     * Hủy đặt chỗ
     * @param seatClass Hạng ghế
     * @param numberOfSeats Số ghế hủy
     */
    void cancelReservation(String seatClass, int numberOfSeats);
    
    /**
     * Kiểm tra còn ghế trống
     * @param seatClass Hạng ghế
     * @return Số ghế còn trống
     */
    int getAvailableSeats(String seatClass);
}