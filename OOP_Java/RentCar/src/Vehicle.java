/**
 * Lớp trừu tượng Vehicle là lớp cơ sở cho tất cả các loại xe trong hệ thống.
 * Nó định nghĩa các thuộc tính và phương thức chung mà mọi xe đều có.
 */
public abstract class Vehicle {
    protected String id;
    protected String brand;
    protected String model;
    protected boolean isAvailable;
    protected double rentalRatePerDay;

    /**
     * Hàm khởi tạo cho một Vehicle.
     *
     * @param id               Mã xe duy nhất.
     * @param brand            Hãng sản xuất.
     * @param model            Model của xe.
     * @param rentalRatePerDay Giá thuê mỗi ngày.
     */
    public Vehicle(String id, String brand, String model, double rentalRatePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
        this.isAvailable = true; // Mặc định xe mới thêm vào là có sẵn
    }

    /**
     * Phương thức trừu tượng để hiển thị thông tin chi tiết của xe.
     * Các lớp con sẽ cung cấp cách triển khai riêng.
     */
    public abstract void displayDetails();

    // Getters and Setters (Encapsulation)
    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }
}