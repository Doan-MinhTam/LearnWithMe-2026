/**
 * Lớp TemperatureSensor đại diện cho cảm biến nhiệt độ.
 * Kế thừa từ WeatherSensor và cung cấp logic báo cáo nhiệt độ.
 */
public class TemperatureSensor extends WeatherSensor {

    /**
     * Nhiệt độ hiện tại đo được (độ C).
     */
    private double celsius;

    /**
     * Phương thức khởi tạo cho cảm biến nhiệt độ.
     *
     * @param id       Mã định danh.
     * @param location Vị trí.
     * @param celsius  Nhiệt độ ban đầu.
     */
    public TemperatureSensor(String id, String location, double celsius) {
        super(id, location);
        this.celsius = celsius;
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Hoàn thiện phương thức này.
     * Chuyển đổi giá trị nhiệt độ từ độ C (biến celsius) sang độ F.
     * Công thức: F = (C * 9 / 5) + 32.
     *
     * @return Nhiệt độ theo độ F.
     */
    private double getFahrenheit() {
        // VIẾT MÃ CỦA BẠN VÀO ĐÂY
        return (celsius * 9 / 5) + 32; // Xóa dòng này đi
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Hoàn thiện phương thức này để tạo báo cáo chi tiết về nhiệt độ.
     * 1. Gọi phương thức getFahrenheit() để lấy giá trị độ F.
     * 2. Tạo một chuỗi báo cáo có định dạng chính xác: "Nhiệt độ: [độ C]°C ([độ F]°F)".
     * Ví dụ: "Nhiệt độ: 39.5°C (103.1°F)"
     * Gợi ý: Sử dụng String.format() với "%.1f" để làm tròn đến một chữ số thập phân.
     * 3. Thêm cảnh báo vào cuối chuỗi báo cáo nếu nhiệt độ rơi vào các trường hợp sau:
     * - Nếu nhiệt độ (celsius) > 38.0, nối thêm chuỗi " - CẢNH BÁO: Nhiệt độ rất cao!"
     * - Nếu nhiệt độ (celsius) < 5.0, nối thêm chuỗi " - CẢNH BÁO: Nhiệt độ rất thấp!"
     *
     * @return Chuỗi báo cáo nhiệt độ hoàn chỉnh.
     */
    @Override
    public String generateReport() {
        // VIẾT MÃ CỦA BẠN VÀO ĐÂY
        double fahrenheit = getFahrenheit();

        String report = String.format(
                "Nhiệt độ: %.1f°C (%.1f°F)",
                celsius,
                fahrenheit
        );

        if (celsius > 38.0) {
            report += " - CẢNH BÁO: Nhiệt độ rất cao!";
        } else if (celsius < 5.0) {
            report += " - CẢNH BÁO: Nhiệt độ rất thấp!";
        }

        return report;
    }
}