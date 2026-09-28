import java.util.Scanner;

public class Main {
    private static void khoiTaoDuLieu() {
        // Người dân
        QuanLyTiemChung.dangKyNguoiDan(new NguoiDan("001", "Nguyễn Văn An", 30, "Hà Nội"));
        QuanLyTiemChung.dangKyNguoiDan(new NguoiDan("002", "Trần Thị Bình", 28, "Hà Nội"));
        QuanLyTiemChung.dangKyNguoiDan(new NguoiDan("003", "Lê Văn Cường", 35, "Hà Nội"));

        // Trung tâm
        TrungTamTiemChung tt01 = new TrungTamTiemChung("TT01", "Trung tâm Y tế Quận 1", "Quận 1");
        TrungTamTiemChung tt02 = new TrungTamTiemChung("TT02", "Bệnh viện Đống Đa", "Đống Đa");
        QuanLyTiemChung.themTrungTam(tt01);
        QuanLyTiemChung.themTrungTam(tt02);

        // Nhập kho
        tt01.nhapKhoVaccine(Vaccine.PFIZER, 1);
        tt01.nhapKhoVaccine(Vaccine.MODERNA, 10);
        tt02.nhapKhoVaccine(Vaccine.ASTRAZENECA, 20);
    }

    private static void testDatLichHen() {
        System.out.println("--- Đang test hàm: datLichHen ---");

        System.out.println("* Kịch bản: Anh An (001) đặt lịch tiêm AstraZeneca tại TT02 (dự kiến thành công).");
        QuanLyTiemChung.datLichHen("001", "TT02", Vaccine.ASTRAZENECA);

        System.out.println();
        System.out.println("* Kịch bản: Anh Cường (003) đặt lịch tiêm Pfizer tại TT01 (dự kiến thất bại vì hết vaccine).");
        QuanLyTiemChung.datLichHen("003", "TT01", Vaccine.PFIZER);
    }

    private static void testGhiNhanTiem() {
        System.out.println("--- Đang test hàm: ghiNhanTiem ---");
        System.out.println("* Kịch bản: Chị Bình (002) đặt lịch và được ghi nhận tiêm thành công mũi Pfizer tại TT01.");

        System.out.println("[Bước 1] Đặt lịch cho chị Bình...");
        LichHenTiem lichHen = QuanLyTiemChung.datLichHen("002", "TT01", Vaccine.PFIZER);

        if (lichHen == null) {
            System.out.println("[THẤT BẠI] Không thể tạo lịch hẹn để thực hiện test ghi nhận tiêm.");
            return;
        }

        System.out.println("[Bước 2] Ghi nhận tiêm cho lịch hẹn vừa tạo...");
        QuanLyTiemChung.ghiNhanTiem(lichHen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lenh = sc.hasNext() ? sc.next().trim().toLowerCase() : "";
        sc.close();

        khoiTaoDuLieu();
        QuanLyTiemChung.inThongTinHeThong();
        System.out.println();

        switch (lenh) {
            case "datlichhen":
                testDatLichHen();
                break;
            case "ghinhantiem":
                testGhiNhanTiem();
                break;
            default:
                System.out.println("Lệnh không hợp lệ: " + lenh);
                break;
        }

        System.out.println();
        System.out.println("--- Trạng thái hệ thống sau khi chạy test ---");
        QuanLyTiemChung.inThongTinHeThong();

        System.out.println();
        System.out.println("--- Chương trình đã kết thúc. ---");
    }
}
