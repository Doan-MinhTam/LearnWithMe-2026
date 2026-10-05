/**
 * Lớp trừu tượng Airplane là lớp cơ sở cho tất cả các loại máy bay.
 * Chứa các thuộc tính và phương thức chung.
 */
public abstract class Airplane {

    /**
     * Mã hiệu của máy bay (ví dụ: VN-A350).
     */
    protected String maHieu;

    /**
     * Tầm bay tối đa của máy bay (km).
     */
    protected double tamBay;

    /**
     * Chi phí nhiên liệu cơ bản cho mỗi km.
     */
    protected static final double CHI_PHI_NHIEN_LIEU_MOI_KM = 70000;

    /**
     * Phương thức khởi tạo cho một máy bay.
     *
     * @param maHieu Mã hiệu.
     * @param tamBay Tầm bay tối đa.
     */
    public Airplane(String maHieu, double tamBay) {
        this.maHieu = maHieu;
        this.tamBay = tamBay;
    }

    /**
     * Phương thức trừu tượng để tính chi phí vận hành cho một chuyến bay.
     *
     * @param quangDuong Quãng đường của chuyến bay (km).
     * @return Tổng chi phí vận hành.
     */
    public abstract double tinhChiPhiHoatDong(double quangDuong);

    /**
     * Phương thức trừu tượng để mô tả quy trình kiểm tra an ninh.
     */
    public abstract void thucHienKiemTraAnNinh();

    /**
     * Hiển thị thông tin cơ bản của máy bay.
     *
     * @return Chuỗi thông tin.
     */
    @Override
    public String toString() {
        return "Mã hiệu: " + maHieu + ", Tầm bay: " + String.format("%,.0f", tamBay) + " km";
    }
}