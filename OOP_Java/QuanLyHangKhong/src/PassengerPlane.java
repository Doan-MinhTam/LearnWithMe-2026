/**
 * Lớp PassengerPlane đại diện cho máy bay chở khách.
 * Kế thừa từ Airplane.
 */
public class PassengerPlane extends Airplane {

    /**
     * Số lượng ghế hành khách.
     */
    private int soGhe;

    /**
     * Chi phí phục vụ cho mỗi hành khách (đồ ăn, nhân viên,...).
     */
    private static final double CHI_PHI_PHUC_VU_MOI_HANH_KHACH = 200000;

    /**
     * Phương thức khởi tạo cho máy bay chở khách.
     *
     * @param maHieu Mã hiệu.
     * @param tamBay Tầm bay.
     * @param soGhe  Số lượng ghế.
     */
    public PassengerPlane(String maHieu, double tamBay, int soGhe) {
        super(maHieu, tamBay);
        this.soGhe = soGhe;
    }

    /**
     * TODO: Hoàn thiện phương thức này.
     * Tính chi phí vận hành cho máy bay chở khách.
     *
     * Yêu cầu:
     * 1. Kiểm tra xem quãng đường bay có vượt quá tầm bay tối đa (tamBay) của máy bay không.
     * - Nếu vượt quá, hãy in ra một cảnh báo và trả về 0.
     * (Ví dụ: "CẢNH BÁO: Chuyến bay vượt tầm bay tối đa của [mã hiệu]")
     * 2. Nếu không vượt quá, tính tổng chi phí theo công thức:
     * Tổng chi phí = (CHI_PHI_NHIEN_LIEU_MOI_KM * quangDuong) + (CHI_PHI_PHUC_VU_MOI_HANH_KHACH * soGhe)
     * (Sử dụng các hằng số đã được định nghĩa sẵn trong lớp Airplane và PassengerPlane).
     *
     * @param quangDuong Quãng đường của chuyến bay (km).
     * @return Tổng chi phí. Trả về 0 nếu không thể thực hiện chuyến bay.
     */
    @Override
    public double tinhChiPhiHoatDong(double quangDuong) {
        // Sinh viên cần viết code ở đây
    }

    /**
     * TODO: Hoàn thiện phương thức này.
     * Mô tả quy trình kiểm tra an ninh cho máy bay chở khách.
     *
     * Yêu cầu:
     * - In ra chuỗi thông báo mô tả quy trình.
     * (Ví dụ: "Máy bay [mã hiệu]: Đang thực hiện kiểm tra an ninh hành khách và soi chiếu hành lý.")
     */
    @Override
    public void thucHienKiemTraAnNinh() {
        // Sinh viên cần viết code ở đây
    }
}