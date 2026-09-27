/**
 * Lớp Car đại diện cho một chiếc ô tô, kế thừa từ Vehicle.
 */
public class Car extends Vehicle {
    private int numberOfSeats;

    /**
     * Hàm khởi tạo cho một Car.
     *
     * @param id               Mã xe.
     * @param brand            Hãng sản xuất.
     * @param model            Model xe.
     * @param rentalRatePerDay Giá thuê mỗi ngày.
     * @param numberOfSeats    Số chỗ ngồi.
     */
    public Car(String id, String brand, String model, double rentalRatePerDay, int numberOfSeats) {
        super(id, brand, model, rentalRatePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Hiển thị thông tin chi tiết của ô tô.
     */
    @Override
    public void displayDetails() {
        System.out.printf("ID: %s | Loại: Ô tô | Hãng: %s | Model: %s | Số chỗ: %d | Giá thuê: %,.0f/ngày\n",
                id, brand, model, numberOfSeats, rentalRatePerDay);
    }
}