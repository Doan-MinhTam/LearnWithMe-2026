/**
 * Lớp CargoPlane đại diện cho máy bay chở hàng.
 * Kế thừa từ Airplane.
 */
public class CargoPlane extends Airplane {

    /**
     * Tải trọng hàng hóa tối đa (tấn).
     */
    private double taiTrongToiDa;

    /**
     * Chi phí bốc xếp cho mỗi tấn hàng.
     */
    private static final double CHI_PHI_BOC_XEP_MOI_TAN = 500000;

    /**
     * Phương thức khởi tạo cho máy bay chở hàng.
     *
     * @param maHieu         Mã hiệu.
     * @param tamBay         Tầm bay.
     * @param taiTrongToiDa  Tải trọng tối đa (tấn).
     */
    public CargoPlane(String maHieu, double tamBay, double taiTrongToiDa) {
        super(maHieu, tamBay);
        this.taiTrongToiDa = taiTrongToiDa;
    }

    /**
     * TODO: Hoàn thiện phương thức này.
     * Tính chi phí vận hành cho máy bay chở hàng.
     *
     * Yêu cầu:
     * 1. Kiểm tra xem quãng đường bay có vượt quá tầm bay tối đa (tamBay) của máy bay không.
     * - Nếu vượt quá, hãy in ra một cảnh báo và trả về 0.
     * (Ví dụ: "CẢNH BÁO: Chuyến bay vượt tầm bay tối đa của [mã hiệu]")
     * 2. Nếu không vượt quá, tính tổng chi phí theo công thức:
     * Tổng chi phí = (CHI_PHI_NHIEN_LIEU_MOI_KM * quangDuong) + (CHI_PHI_BOC_XEP_MOI_TAN * taiTrongToiDa)
     * (Sử dụng các hằng số đã được định nghĩa sẵn trong lớp Airplane và CargoPlane).
     *
     * @param quangDuong Quãng đường của chuyến bay (km).
     * @return Tổng chi phí. Trả về 0 nếu không thể thực hiện chuyến bay.
     */
    @Override
    public double tinhChiPhiHoatDong(double quangDuong) {
        // Sinh viên cần viết code ở đây
        return 0.0;
    }

    /**
     * TODO: Hoàn thiện phương thức này.
     * Mô tả quy trình kiểm tra an ninh cho máy bay chở hàng.
     *
     * Yêu cầu:
     * - In ra chuỗi thông báo mô tả quy trình.
     * (Ví dụ: "Máy bay [mã hiệu]: Đang thực hiện soi chiếu và niêm phong các container hàng hóa.")
     */
    @Override
    public void thucHienKiemTraAnNinh() {
        // Sinh viên cần viết code ở đây
    }
}