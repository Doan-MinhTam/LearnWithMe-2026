import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Lớp WeatherStation đại diện cho một trạm quan trắc thời tiết.
 * Quản lý một danh sách các cảm biến và tạo báo cáo tổng hợp.
 */
public class WeatherStation {

    /**
     * Tên của trạm quan trắc.
     */
    private String stationName;
    /**
     * Danh sách các cảm biến được lắp đặt tại trạm.
     */
    private List<WeatherSensor> sensors;

    /**
     * Phương thức khởi tạo cho một trạm thời tiết.
     *
     * @param stationName Tên của trạm.
     */
    public WeatherStation(String stationName) {
        this.stationName = stationName;
        this.sensors = new ArrayList<>();
    }

    /**
     * Thêm một cảm biến mới vào trạm.
     *
     * @param sensor Cảm biến cần thêm.
     */
    public void addSensor(WeatherSensor sensor) {
        sensors.add(sensor);
        System.out.println("Đã lắp đặt cảm biến mới tại trạm: " + sensor.id);
    }

    /**
     * Tạo và hiển thị một báo cáo thời tiết đầy đủ từ tất cả các cảm biến.
     * Tính đa hình được thể hiện ở đây: phương thức generateReport() của lớp con
     * cụ thể sẽ được gọi cho mỗi cảm biến trong danh sách.
     */
    public void generateFullReport() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        String formattedDateTime = now.format(formatter);

        System.out.println("\n=============================================");
        System.out.println("BÁO CÁO THỜI TIẾT - TRẠM " + this.stationName);
        System.out.println("Thời gian: " + formattedDateTime);
        System.out.println("---------------------------------------------");

        if (sensors.isEmpty()) {
            System.out.println("Trạm chưa được lắp đặt cảm biến nào.");
        } else {
            for (WeatherSensor sensor : sensors) {
                // Đây là điểm thể hiện tính đa hình
                System.out.println("- " + sensor.generateReport() + " (Từ " + sensor.id + ")");
            }
        }
        System.out.println("=============================================");
    }
}