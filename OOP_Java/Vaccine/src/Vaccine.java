/**
 * Đại diện cho một loại vaccine trong hệ thống.
 * để đảm bảo chỉ có một tập hợp các loại vaccine được xác định trước.
 * Mỗi loại vaccine có tên, số liều cần thiết và khoảng cách ngày giữa các liều.
 */
public class Vaccine {

    // Các hằng số static final để đại diện cho các loại vaccine cụ thể
    public static final Vaccine PFIZER = new Vaccine("Pfizer-BioNTech", 2, 21);
    public static final Vaccine MODERNA = new Vaccine("Moderna", 2, 28);
    public static final Vaccine ASTRAZENECA = new Vaccine("AstraZeneca", 2, 56);
    public static final Vaccine JOHNSON_AND_JOHNSON = new Vaccine("Johnson & Johnson", 1, 0);

    private final String tenVaccine;
    private final int soLieuCanThiet;
    private final int ngayGiuaCacLieu;

    /**
     * Constructor private để ngăn việc tạo đối tượng từ bên ngoài.
     * Chỉ có thể tạo các đối tượng vaccine bên trong chính lớp này.
     *
     * @param tenVaccine Tên đầy đủ của vaccine.
     * @param soLieuCanThiet Tổng số liều cần thiết để hoàn thành.
     * @param ngayGiuaCacLieu Khoảng cách tối thiểu (ngày) giữa các liều.
     */
    private Vaccine(String tenVaccine, int soLieuCanThiet, int ngayGiuaCacLieu) {
        this.tenVaccine = tenVaccine;
        this.soLieuCanThiet = soLieuCanThiet;
        this.ngayGiuaCacLieu = ngayGiuaCacLieu;
    }

    /**
     * Lấy tên đầy đủ của vaccine.
     * @return Tên vaccine.
     */
    public String getTenVaccine() {
        return tenVaccine;
    }

    /**
     * Lấy tổng số liều cần thiết.
     * @return Số liều.
     */
    public int getSoLieuCanThiet() {
        return soLieuCanThiet;
    }

    @Override
    public String toString() {
        return this.tenVaccine;
    }
}