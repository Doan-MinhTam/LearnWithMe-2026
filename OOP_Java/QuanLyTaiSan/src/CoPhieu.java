import java.util.Random;

/**
 * Lớp CoPhieu đại diện cho tài sản là cổ phiếu.
 * Giá trị của nó biến động ngẫu nhiên dựa trên rủi ro.
 */
public class CoPhieu extends TaiSan {
    private double mucDoRuiRo; // 0.0 (an toàn) đến 1.0 (rất mạo hiểm)
    private Random random = new Random(1);

    public CoPhieu(String maTaiSan, double giaTriBanDau, double mucDoRuiRo) {
        super(maTaiSan, giaTriBanDau);
        this.mucDoRuiRo = mucDoRuiRo;
    }

    @Override
    public void capNhatGiaTri() {
        /**
         * YÊU CẦU: Hoàn thiện phương thức này.
         *
         * Mục tiêu: Cập nhật giá trị của cổ phiếu dựa trên sự biến động ngẫu nhiên và mức độ rủi ro.
         * Các bước thực hiện:
         * 1. Tạo một số thực ngẫu nhiên trong khoảng [-1.0, 1.0]. Đây là "biến động cơ sở".
         * Gợi ý: (random.nextDouble() * 2.0) - 1.0
         * 2. Tính "tỉ lệ thay đổi thực tế" bằng cách nhân "biến động cơ sở" với 'this.mucDoRuiRo'.
         * 3. Cập nhật 'this.giaTriHienTai' theo công thức:
         * Giá trị mới = Giá trị cũ * (1 + tỉ lệ thay đổi thực tế).
         */
        // VIẾT CODE CỦA BẠN VÀO ĐÂY
        double bienDongCoSo = random.nextDouble(-1.0,1.1);
        double tiLeThayDoiThucTe = bienDongCoSo * this.mucDoRuiRo;
        this.giaTriHienTai = giaTriHienTai * (1 + tiLeThayDoiThucTe);
    }
}