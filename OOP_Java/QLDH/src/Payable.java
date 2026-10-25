/**
 * Interface cho các đối tượng có thể thanh toán
 */
interface Payable {
    /**
     * Thanh toán
     * @throws PaymentFailedException nếu thanh toán thất bại
     */
    void pay() throws PaymentFailedException;
    
    /**
     * Kiểm tra đã thanh toán chưa
     * @return true nếu đã thanh toán
     */
    boolean isPaid();
}
