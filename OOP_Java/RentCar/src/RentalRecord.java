import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Lớp RentalRecord lưu trữ thông tin về một lần thuê xe.
 * Bao gồm xe nào, khách hàng nào thuê, và thời gian thuê.
 */
public class RentalRecord {
    private Vehicle vehicle;
    private Customer customer;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    public RentalRecord(Vehicle vehicle, Customer customer) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDate = LocalDate.now(); // Ghi nhận ngày hiện tại là ngày thuê
        this.returnDate = null; // Chưa trả xe
    }

    /**
     * Tính tổng chi phí thuê xe.
     * <p>
     * YÊU CẦU SINH VIÊN HOÀN THIỆN:
     * 1. Xác định ngày kết thúc để tính toán.
     * - Nếu xe đã được trả (biến `returnDate` khác `null`), ngày kết thúc chính là `returnDate`.
     * - Nếu xe CHƯA được trả (biến `returnDate` là `null`), ngày kết thúc được xem là ngày hiện tại (LocalDate.now()).
     * 2. ===> Sử dụng `ChronoUnit.DAYS.between(ngàyBắtĐầu, ngàyKếtThúc)` để tính số ngày chênh lệch.
     * Lưu ý: Phải cộng thêm 1 vào kết quả để tính cả ngày thuê đầu tiên.
     * Ví dụ: thuê và trả trong cùng ngày vẫn tính là 1 ngày.
     * 3. Tính tổng chi phí bằng cách nhân số ngày thuê với giá thuê mỗi ngày của xe (`vehicle.getRentalRatePerDay()`).
     * 4. Trả về tổng chi phí đã tính.
     *
     * @return Tổng chi phí.
     */
    public double calculateTotalCost() {
        // TODO: Sinh viên cần hoàn thiện mã nguồn ở đây
        return 0; // Giá trị trả về tạm thời
    }

    // Getters and Setters
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}