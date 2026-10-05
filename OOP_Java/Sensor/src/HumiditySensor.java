/**
 * Lớp HumiditySensor đại diện cho cảm biến độ ẩm.
 * Kế thừa từ WeatherSensor và cung cấp logic báo cáo độ ẩm.
 */
public class HumiditySensor extends WeatherSensor {

    /**
     * Độ ẩm tương đối hiện tại (%).
     */
    private double humidity;

    /**
     * Phương thức khởi tạo cho cảm biến độ ẩm.
     *
     * @param id       Mã định danh.
     * @param location Vị trí.
     * @param humidity Độ ẩm ban đầu.
     */
    public HumiditySensor(String id, String location, double humidity) {
        super(id, location);
        this.humidity = humidity;
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Hoàn thiện phương thức này để tạo báo cáo chi tiết về độ ẩm.
     * 1. Dựa vào giá trị của biến `humidity`, xác định mô tả trạng thái theo quy tắc sau:
     * - Nếu độ ẩm < 30: "Khô"
     * - Nếu độ ẩm >= 30 và <= 60: "Lý tưởng"
     * - Nếu độ ẩm > 60: "Ẩm ướt"
     * 2. Trả về một chuỗi được định dạng chính xác: "Độ ẩm: [giá trị]% ([mô tả])".
     * Ví dụ: "Độ ẩm: 75.0% (Ẩm ướt)"
     * Gợi ý: Sử dụng String.format() với "%.1f" để làm tròn đến một chữ số thập phân.
     *
     * @return Chuỗi báo cáo độ ẩm.
     */
    @Override
    public String generateReport() {
        // VIẾT MÃ CỦA BẠN VÀO ĐÂY
        return ""; // Xóa dòng này đi
    }
}