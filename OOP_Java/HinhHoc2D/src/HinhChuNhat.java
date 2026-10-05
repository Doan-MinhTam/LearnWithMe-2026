/**
 * Lớp HinhChuNhat đại diện cho một hình chữ nhật, được xác định bằng 2 đỉnh đối diện.
 * Kế thừa từ HinhHoc2D.
 */
public class HinhChuNhat extends HinhHoc2D {

    protected double x1, y1; // Tọa độ đỉnh 1
    protected double x2, y2; // Tọa độ đỉnh 2 (đối diện đỉnh 1)

    public HinhChuNhat(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void dichChuyen(double dx, double dy) {
        this.x1 += dx;
        this.y1 += dy;
        this.x2 += dx;
        this.y2 += dy;
    }

    @Override
    public double tinhChuVi() {
        /**
         * YÊU CẦU: Hoàn thiện phương thức này để tính và trả về chu vi của hình chữ nhật.
         *
         * Gợi ý:
         * - Công thức tính chu vi là: 2 * (chiều_dài + chiều_rộng).
         * - Chiều dài và chiều rộng có thể được tính từ tọa độ của 2 đỉnh đối diện
         * (x1, y1) và (x2, y2) bằng cách sử dụng hàm `Math.abs()`.
         * Ví dụ: chieuDai = Math.abs(x2 - x1).
         */
        // Xóa dòng này và viết code của bạn
        return 2 * (Math.abs(x2-x1) + Math.abs(y2-y1));
    }
    
    @Override
    public void quay(double goc) {
        /**
         * YÊU CẦU: Hoàn thiện phương thức này để quay hình chữ nhật một góc `goc` (tính bằng độ)
         * quanh tâm của nó.
         *
         * Các bước thực hiện:
         * 1. Tìm tọa độ tâm (tamX, tamY) của hình chữ nhật.
         * tamX = (x1 + x2) / 2;
         * tamY = (y1 + y2) / 2;
         *
         * 2. Chuyển đổi góc quay từ độ sang radian vì các hàm lượng giác trong Java
         * sử dụng radian.
         * gocRad = Math.toRadians(goc);
         *
         * 3. Tính giá trị sin và cos của góc radian đó.
         * cosGoc = Math.cos(gocRad);
         * sinGoc = Math.sin(gocRad);
         *
         * 4. Áp dụng công thức quay 2D cho từng đỉnh (x1, y1) và (x2, y2) quanh tâm.
         * Với một điểm (x, y) bất kỳ quay quanh tâm (tamX, tamY), tọa độ mới (newX, newY)
         * sẽ là:
         * newX = tamX + (x - tamX) * cosGoc - (y - tamY) * sinGoc;
         * newY = tamY + (x - tamX) * sinGoc + (y - tamY) * cosGoc;
         *
         * 5. Cập nhật lại tọa độ mới cho các thuộc tính x1, y1, x2, y2 của lớp.
         */
        // Viết code của bạn ở đây
        double tamX = (x1 + x2) / 2;
        double tamY = (y1 + y2) / 2;
        double gocRad = Math.toRadians(goc);
        double cosGoc = Math.cos(gocRad);
        double sinGoc = Math.sin(gocRad);

        double newX1 = tamX + (x1 - tamX) * cosGoc - (y1 - tamY) * sinGoc;
        double newY1 = tamY + (x1 - tamX) * sinGoc + (y1 - tamY) * cosGoc;

        double newX2 = tamX + (x2 - tamX) * cosGoc - (y2 - tamY) * sinGoc;
        double newY2 = tamY + (x2 - tamX) * sinGoc + (y2 - tamY) * cosGoc;
        x1 = newX1;
        y1 = newY1;
        x2 = newX2;
        y2 = newY2;
    }


    @Override
    public double tinhDienTich() {
        double chieuDai = Math.abs(x2 - x1);
        double chieuRong = Math.abs(y2 - y1);
        return chieuDai * chieuRong;
    }



    @Override
    public String toString() {
        return String.format("Hình chữ nhật xác định bởi đỉnh (%.1f, %.1f) và (%.1f, %.1f)",
                x1, y1, x2, y2);
    }
}