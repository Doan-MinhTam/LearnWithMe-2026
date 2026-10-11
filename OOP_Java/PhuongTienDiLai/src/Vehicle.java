/**
 * BÀI TẬP: QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG
 * Chủ đề: Tính kế thừa (Inheritance) và Đa hình (Polymorphism)
 * 
 * YÊU CẦU:
 * - Hoàn thiện 2 class: Car và Motorcycle
 * - Cả 2 class đều phải implement interface Vehicle
 * - Tuân thủ đúng mô tả của từng phương thức
 */


/**
 * Interface Vehicle - Đại diện cho một phương tiện giao thông
 */
interface Vehicle {
    /**
     * Lấy tên phương tiện
     * @return Tên của phương tiện
     */
    String getName();
    
    /**
     * Lấy tốc độ tối đa của phương tiện (km/h)
     * @return Tốc độ tối đa
     */
    double getMaxSpeed();
    
    /**
     * Lấy số lượng hành khách tối đa
     * @return Số hành khách tối đa
     */
    int getMaxPassengers();
    
    /**
     * Tính chi phí di chuyển cho một quãng đường
     * @param distance Quãng đường cần di chuyển (km)
     * @return Chi phí (VNĐ)
     */
    double calculateTripCost(double distance);
    
    /**
     * Lấy thông tin mô tả về phương tiện
     * @return Chuỗi mô tả phương tiện
     */
    String getDescription();
}
