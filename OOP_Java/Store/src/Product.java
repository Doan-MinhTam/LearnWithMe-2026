/**
 * Lớp trừu tượng Product là lớp cơ sở cho tất cả các sản phẩm trong cửa hàng.
 * Chứa các thông tin chung và một phương thức trừu tượng để tính giá bán cuối cùng.
 */
public abstract class Product {

    /**
     * Mã định danh duy nhất của sản phẩm.
     */
    protected String maSP;

    /**
     * Tên của sản phẩm.
     */
    protected String tenSP;

    /**
     * Giá gốc của sản phẩm trước khi tính thuế và khuyến mãi.
     */
    protected double giaGoc;

    /**
     * Phương thức khởi tạo cho một sản phẩm.
     *
     * @param maSP   Mã sản phẩm.
     * @param tenSP  Tên sản phẩm.
     * @param giaGoc Giá gốc.
     */
    public Product(String maSP, String tenSP, double giaGoc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaGoc = giaGoc;
    }

    /**
     * Phương thức trừu tượng để tính giá bán cuối cùng cho khách hàng.
     * Mỗi loại sản phẩm sẽ có cách tính riêng.
     *
     * @return Giá bán cuối cùng.
     */
    public abstract double getFinalPrice();

    /**
     * Hiển thị thông tin cơ bản của sản phẩm.
     *
     * @return Chuỗi thông tin sản phẩm.
     */
    @Override
    public String toString() {
        return "Mã SP: " + maSP + ", Tên: " + tenSP + ", Giá gốc: " + String.format("%,.0f", giaGoc);
    }
}