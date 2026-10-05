/**
 * Lớp WindSensor đại diện cho cảm biến gió.
 * Kế thừa từ WeatherSensor và cung cấp logic báo cáo về gió.
 */
public class WindSensor extends WeatherSensor {

    /**
     * Tốc độ gió (km/h).
     */
    private double speedKmh;
    /**
     * Hướng gió (ví dụ: "Đông Bắc", "Tây Nam").
     */
    private String direction;

    /**
     * Phương thức khởi tạo cho cảm biến gió.
     *
     * @param id        Mã định danh.
     * @param location  Vị trí.
     * @param speedKmh  Tốc độ gió.
     * @param direction Hướng gió.
     */
    public WindSensor(String id, String location, double speedKmh, String direction) {
        super(id, location);
        this.speedKmh = speedKmh;
        this.direction = direction;
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Hoàn thiện phương thức này để phân loại sức gió theo thang Beaufort đơn giản.
     * Dựa vào giá trị của biến `speedKmh`, trả về chuỗi mô tả tương ứng:
     * - Dưới 1 km/h: "Lặng gió"
     * - Từ 1 đến 5 km/h: "Gió nhẹ"
     * - Từ trên 5 đến 19 km/h: "Gió yếu"
     * - Từ trên 19 đến 38 km/h: "Gió vừa"
     * - Từ trên 38 đến 61 km/h: "Gió khá mạnh"
     * - Từ trên 61 đến 88 km/h: "Gió mạnh"
     * - Trên 88 km/h: "Bão"
     *
     * @return Mô tả sức gió.
     */
    private String getBeaufortDescription() {

        // VIẾT MÃ CỦA BẠN VÀO ĐÂY
        if (speedKmh < 1) {
            return "Lặng gió";
        } else if (speedKmh <= 5) {
            return "Gió nhẹ";
        } else if (speedKmh <= 19) {
            return "Gió yếu";
        } else if (speedKmh <= 38) {
            return "Gió vừa";
        } else if (speedKmh <= 61) {
            return "Gió khá mạnh";
        } else if (speedKmh <= 88) {
            return "Gió mạnh";
        } else {
            return "Bão";
        }
    }

    /**
     * Tạo báo cáo chi tiết về gió.
     * Báo cáo bao gồm tốc độ, hướng và mô tả sức gió.
     *
     * @return Chuỗi báo cáo gió.
     */
    @Override
    public String generateReport() {
        return String.format("Gió: %s, %.1f km/h (%s)", this.direction, this.speedKmh, getBeaufortDescription());
    }
}