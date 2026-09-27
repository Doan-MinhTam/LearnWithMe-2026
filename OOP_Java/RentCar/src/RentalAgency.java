import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;
    private List<Customer> customers;
    private List<RentalRecord> rentalRecords;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentalRecords = new ArrayList<>();
    }

    /**
     * [BÀI TẬP] Xử lý nghiệp vụ cho thuê xe.
     * <p>
     * YÊU CẦU:
     * 1. Tìm Customer theo customerId và Vehicle theo vehicleId.
     * 2. Kiểm tra lỗi và TRẢ VỀ chuỗi thông báo (không in):
     * - Nếu không thấy khách: "Lỗi: Không tìm thấy khách hàng với ID [id]"
     * - Nếu không thấy xe: "Lỗi: Không tìm thấy xe với ID [id]"
     * - Nếu xe đã cho thuê: "Lỗi: Xe [Hãng] [Model] hiện không có sẵn"
     * 3. Nếu hợp lệ:
     * - Cập nhật xe (isAvailable = false), tạo RentalRecord, thêm vào danh sách.
     * - TRẢ VỀ: "Thành công: Khách hàng [Tên] đã thuê xe [Hãng] [Model]"
     *
     * @return Chuỗi thông báo kết quả.
     */
    public String rentVehicle(String customerId, String vehicleId) {
        // TODO: Sinh viên hoàn thiện logic
        Customer customer = null;
        for (Customer cus : customers) {
            if (cus.getCustomerId().equals(customerId)) {
                customer = cus;
                break;
            }
        }
        if (customer == null) {
            return "Lỗi: Không tìm thấy khách hàng với ID " + customerId;
        }

        Vehicle vehicle = null;
        for (Vehicle ve : vehicles) {
            if (ve.getId().equals(vehicleId)) {
                vehicle = ve;
                break;
            }
        }
        if (vehicle == null) {
            return "Lỗi: Không tìm thấy xe với ID " + vehicleId;
        }

        if (!vehicle.isAvailable()) {
            return "Lỗi: Xe " + vehicle.getBrand() + " "
                    + vehicle.getModel() + " hiện không có sẵn";
        }

        vehicle.setAvailable(false);

        RentalRecord rentalRecord = new RentalRecord(vehicle, customer);
        rentalRecords.add(rentalRecord);

        return "Thành công: Khách hàng "
                + customer.getName()
                + " đã thuê xe "
                + vehicle.getBrand()
                + " "
                + vehicle.getModel();
    }

    /**
     * [BÀI TẬP] Xử lý nghiệp vụ trả xe.
     * <p>
     * YÊU CẦU:
     * 1. Tìm Vehicle theo vehicleId. Nếu không thấy trả về chuỗi thông báo lỗi "Lỗi: Không tìm thấy xe với ID [id]".
     * 2. Tìm RentalRecord đang hoạt động (trùng ID xe và returnDate == null).
     * 3. Nếu không thấy bản ghi hoạt động: Trả về "Lỗi: Không tìm thấy giao dịch thuê đang hoạt động cho xe này"
     * 4. Nếu thấy:
     * - Cập nhật xe (isAvailable = true), cập nhật returnDate cho bản ghi là ngày hiện tại setReturnDate(LocalDate.now()).
     * - Tính tiền bằng calculateTotalCost().
     * - TRẢ VỀ: "Thành công: Xe [Hãng] [Model] đã được trả - Tổng chi phí: [Tiền] VND"
     *
     * @return Chuỗi thông báo kết quả.
     */
    public String returnVehicle(String vehicleId) {
        // TODO: Sinh viên hoàn thiện logic
        return "";
    }

    /**
     * [BÀI TẬP] Trả về chuỗi danh sách xe đang có sẵn.
     * Duyệt danh sách vehicles, nếu xe sẵn sàng thì gọi displayDetails().
     * Nếu không có xe nào: "Tất cả xe đã được cho thuê."
     */
    public String getAvailableVehiclesInfo() {

        return "";
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }
}