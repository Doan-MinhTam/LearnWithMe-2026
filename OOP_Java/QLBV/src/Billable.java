/**
 * Interface cho đối tượng có thể tính toán chi phí
 */
public interface Billable {
    /**
     * Tính tổng chi phí
     * @return Tổng chi phí
     */
    double calculateTotalCost();
    
    /**
     * Thêm chi phí
     * @param description Mô tả
     * @param amount Số tiền
     */
    void addCharge(String description, double amount);
}