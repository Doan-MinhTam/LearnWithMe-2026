import java.util.ArrayList;
import java.util.List;

/**
 * Lớp DanhSachDauTu quản lý một danh mục các tài sản đầu tư.
 */
public class DanhSachDauTu {
    private List<TaiSan> danhSach;

    public DanhSachDauTu() {
        this.danhSach = new ArrayList<>();
    }
    
    public List<TaiSan> getDanhSach(){
        return danhSach;
    }

    public void themTaiSan(TaiSan taiSan) {
        danhSach.add(taiSan);
    }

    /**
     * Chạy mô phỏng sự thay đổi giá trị của danh mục qua nhiều năm.
     * Đây là nơi tính đa hình được thể hiện rõ nhất.
     *
     * @param soNam Số năm để mô phỏng.
     */
    public void moPhongQuaNhieuNam(int soNam) {
        System.out.println("\n>>> BẮT ĐẦU MÔ PHỎNG ĐẦU TƯ TRONG " + soNam + " NĂM...");
        for (int i = 1; i <= soNam; i++) {
            // Với mỗi năm, cập nhật giá trị của tất cả tài sản
            for (TaiSan ts : danhSach) {
                ts.capNhatGiaTri();
            }
            System.out.println("--- Kết thúc năm thứ " + i + " ---");
        }
        System.out.println(">>> KẾT THÚC MÔ PHỎNG.");
    }

    /**
     * Hiển thị báo cáo chi tiết về tình hình danh mục đầu tư.
     */
    public void hienThiBaoCao() {
        
        System.out.println("\n===== BÁO CÁO DANH MỤC ĐẦU TƯ =====");
        double tongGiaTriHienTai = 0;
        double tongLoiNhuan = 0;

        for (TaiSan ts : danhSach) {
            System.out.println(ts); // In thông tin tài sản
            tongGiaTriHienTai += ts.giaTriHienTai; // Cộng tổng giá trị
            tongLoiNhuan += ts.tinhLoiNhuan(); // Cộng tổng lợi nhuận
        }

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("TỔNG CỘNG: | Tổng giá trị hiện tại: %,15.0f | Tổng lợi nhuận: %,15.0f\n",
                tongGiaTriHienTai, tongLoiNhuan);
        System.out.println("================================================================================================");
    }
}