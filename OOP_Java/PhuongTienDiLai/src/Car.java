/**
 * Class Car - Đại diện cho xe hơi
 * <p>
 * MÔ TẢ:
 * - Car là một loại Vehicle (phương tiện giao thông)
 * - Có 4 thuộc tính: name (tên xe), maxSpeed (tốc độ tối đa),
 * maxPassengers (số hành khách tối đa), fuelConsumption (mức tiêu thụ nhiên liệu)
 * - fuelConsumption: lượng nhiên liệu tiêu thụ trên 100km (lít/100km)
 * <p>
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính phù hợp
 * 2. Tạo constructor nhận 4 tham số để khởi tạo đối tượng
 * 3. Implement tất cả phương thức từ interface Vehicle:
 * - getName(): trả về tên xe
 * - getMaxSpeed(): trả về tốc độ tối đa
 * - getMaxPassengers(): trả về số hành khách tối đa
 * - calculateTripCost(distance):
 * + Công thức: (distance / 100) * fuelConsumption * 25000
 * + distance: quãng đường (km)
 * + 25000: giá xăng (VNĐ/lít)
 * - getDescription(): trả về chuỗi mô tả đầy đủ về xe
 * + Format: "Xe hơi: [tên] | Tốc độ tối đa: [speed] km/h | Chỗ ngồi: [passengers] | Tiêu thụ: [fuel] lít/100km"
 */
class Car implements Vehicle {
    // TODO: Khai báo thuộc tính
    public String name;
    public double maxSpeed;
    public int maxPassengers;
    public double fuelConsumption;
    // TODO: Tạo constructor

    public Car(String name, double maxSpeed, int maxPassengers, int fuelConsumption) {
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
       return String.format("Xe hơi: %s | Tốc độ tối đa: %.1f km/h | Chỗ ngồi: %d | Tiêu thụ: %.1f lít/100km", name, maxSpeed, maxPassengers, fuelConsumption);
    }
}

