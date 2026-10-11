/**
 * Class Motorcycle - Đại diện cho xe máy
 * 
 * MÔ TẢ:
 * - Motorcycle là một loại Vehicle
 * - Có 4 thuộc tính: name (tên xe), maxSpeed (tốc độ tối đa),
 *   maxPassengers (số hành khách tối đa), fuelConsumption (mức tiêu thụ nhiên liệu)
 * - fuelConsumption: lượng nhiên liệu tiêu thụ trên 100km (lít/100km)
 * 
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính phù hợp
 * 2. Tạo constructor nhận 4 tham số để khởi tạo đối tượng
 * 3. Implement tất cả phương thức từ interface Vehicle:
 *    - getName(): trả về tên xe
 *    - getMaxSpeed(): trả về tốc độ tối đa
 *    - getMaxPassengers(): trả về số hành khách tối đa
 *    - calculateTripCost(distance):
 *        + Công thức: (distance / 100) * fuelConsumption * 25000
 *        + distance: quãng đường (km)
 *        + 25000: giá xăng (VNĐ/lít)
 *    - getDescription(): trả về chuỗi mô tả đầy đủ về xe
 *        + Format: "Xe máy: [tên] | Tốc độ tối đa: [speed] km/h | Chỗ ngồi: [passengers] | Tiêu thụ: [fuel] lít/100km"
 */
class Motorcycle implements Vehicle {
    // TODO: Khai báo thuộc tính
    public String name;
    public double maxSpeed;
    public int maxPassengers;
    public double fuelConsumption;
    // TODO: Tạo constructor

    public Motorcycle(String name, double maxSpeed, int maxPassengers, int fuelConsumption) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    // TODO: Implement các phương thức từ interface


    public double calculateTripCost(double distance) {
        return (distance / 100) * fuelConsumption * 25000;
    }

    public String getDescription(){
        return  String.format("Xe máy: %s | Tốc độ tối đa: %.1f km/h | Chỗ ngồi: %d | Tiêu thụ: %f lít/100km", name, maxSpeed, maxPassengers, fuelConsumption);
    }
}