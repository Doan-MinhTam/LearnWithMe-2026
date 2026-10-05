/**
 * Lớp trừu tượng WeatherSensor là lớp cơ sở cho tất cả các loại cảm biến thời tiết.
 * Nó định nghĩa các thuộc tính và hành vi chung mà mọi cảm biến phải có.
 */
public abstract class WeatherSensor {

    /**
     * Mã định danh duy nhất cho mỗi cảm biến.
     */
    protected String id;

    /**
     * Vị trí lắp đặt của cảm biến.
     */
    protected String location;

    /**
     * Phương thức khởi tạo cho một cảm biến.
     *
     * @param id       Mã định danh.
     * @param location Vị trí lắp đặt.
     */
    public WeatherSensor(String id, String location) {
        this.id = id;
        this.location = location;
    }

    /**
     * Phương thức trừu tượng để tạo ra một báo cáo từ dữ liệu của cảm biến.
     * Mỗi loại cảm biến sẽ có định dạng báo cáo riêng.
     *
     * @return Một chuỗi chứa nội dung báo cáo.
     */
    public abstract String generateReport();

    /**
     * Trả về thông tin cơ bản của cảm biến.
     *
     * @return Chuỗi thông tin.
     */
    @Override
    public String toString() {
        return "Cảm biến ID: " + id + " tại " + location;
    }
}