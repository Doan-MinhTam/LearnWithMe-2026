import java.util.ArrayList;
import java.util.List;

/**
 * Lớp HangHangKhong quản lý một đội bay.
 */
public class HangHangKhong {

    /**
     * Tên của hãng hàng không.
     */
    private String tenHang;
    /**
     * Danh sách các máy bay trong đội bay.
     */
    private List<Airplane> doiBay;

    /**
     * Phương thức khởi tạo cho hãng hàng không.
     *
     * @param tenHang Tên hãng.
     */
    public HangHangKhong(String tenHang) {
        this.tenHang = tenHang;
        this.doiBay = new ArrayList<>();
    }

    /**
     * Thêm một máy bay mới vào đội bay.
     *
     * @param mayBay Máy bay cần thêm.
     */
    public void themMayBay(Airplane mayBay) {
        doiBay.add(mayBay);
        System.out.println("Đã thêm máy bay " + mayBay.maHieu + " vào đội bay của " + this.tenHang);
    }

    /**
     * Tính tổng chi phí vận hành cho toàn bộ đội bay cho một chuyến bay.
     * Tính đa hình được thể hiện ở đây: phương thức tinhChiPhiHoatDong() của
     * lớp con cụ thể sẽ được gọi cho mỗi máy bay.
     *
     * @param quangDuong Quãng đường của chuyến bay.
     */
    public void tinhTongChiPhiChoChuyenBay(double quangDuong) {
        System.out.println("\n===== TÍNH TOÁN CHI PHÍ VẬN HÀNH CHO CHUYẾN BAY " + quangDuong + " KM =====");
        double tongChiPhi = 0;
        for (Airplane mayBay : doiBay) {
            double chiPhi = mayBay.tinhChiPhiHoatDong(quangDuong);
            tongChiPhi += chiPhi;
            if (chiPhi > 0) {
                System.out.println("- Chi phí cho " + mayBay.maHieu + ": " + String.format("%,.0f", chiPhi) + " VND");
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("TỔNG CHI PHÍ VẬN HÀNH: " + String.format("%,.0f", tongChiPhi) + " VND");
        System.out.println("=======================================================");
    }

    /**
     * Yêu cầu tất cả máy bay thực hiện kiểm tra an ninh.
     * Tính đa hình được thể hiện ở đây: phương thức thucHienKiemTraAnNinh() của
     * lớp con cụ thể sẽ được gọi.
     */
    public void thucHienKiemTraAnNinhTruocChuyenBay() {
        System.out.println("\n===== QUY TRÌNH KIỂM TRA AN NINH TRƯỚC CHUYẾN BAY =====");
        for (Airplane mayBay : doiBay) {
            mayBay.thucHienKiemTraAnNinh();
        }
        System.out.println("=======================================================");
    }
}