import java.util.ArrayList;
import java.util.List;

/**
 * Đại diện cho một người dân trong hệ thống tiêm chủng.
 * Mỗi người có thông tin cá nhân và lịch sử tiêm chủng.
 * Lớp này thể hiện tính đóng gói (encapsulation) cao.
 */
public class NguoiDan {
    private final String cccd; // Căn cước công dân
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private List<String> lichSuTiem; // Lưu lại thông tin các mũi đã tiêm

    /**
     * Constructor để tạo một đối tượng NguoiDan mới.
     *
     * @param cccd   Số Căn cước công dân (định danh duy nhất).
     * @param hoTen  Họ và tên.
     * @param tuoi   Tuổi.
     * @param diaChi Địa chỉ.
     */
    public NguoiDan(String cccd, String hoTen, int tuoi, String diaChi) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.lichSuTiem = new ArrayList<>();
    }

    // Getters
    public String getCccd() { return cccd; }
    public String getHoTen() { return hoTen; }
    public int getSoMuiDaTiem() { return lichSuTiem.size(); }
    public List<String> getLichSuTiem() { return lichSuTiem; }

    /**
     * Thêm một bản ghi mới vào lịch sử tiêm chủng của người này.
     *
     * @param thongTinMuiTiem Chuỗi mô tả mũi tiêm (ví dụ: "Mũi 1 - Pfizer tại Trung tâm A").
     */
    public void themMuiTiem(String thongTinMuiTiem) {
        this.lichSuTiem.add(thongTinMuiTiem);
    }

    @Override
    public String toString() {
        return "NguoiDan[CCCD=" + cccd + ", HoTen='" + hoTen + "', SoMuiDaTiem=" + getSoMuiDaTiem() + "]";
    }
}