/**
 * Lớp Motorcycle đại diện cho một chiếc xe máy, kế thừa từ Vehicle.
 */
public class Motorcycle extends Vehicle {
    private int engineCapacity; // in CC

    /**
     * Hàm khởi tạo cho một Motorcycle.
     *
     * @param id               Mã xe.
     * @param brand            Hãng sản xuất.
     * @param model            Model xe.
     * @param rentalRatePerDay Giá thuê mỗi ngày.
     * @param engineCapacity   Dung tích xi lanh (CC).
     */
    public Motorcycle(String id, String brand, String model, double rentalRatePerDay, int engineCapacity) {
        super(id, brand, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    /**
     * Hiển thị thông tin chi tiết của xe máy.
     */
    @Override
    public void displayDetails() {
        System.out.printf("ID: %s | Loại: Xe máy | Hãng: %s | Model: %s | Phân khối: %dcc | Giá thuê: %,.0f/ngày\n",
                id, brand, model, engineCapacity, rentalRatePerDay);
    }
}