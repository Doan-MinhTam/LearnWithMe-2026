import java.time.LocalDate;

/**
 * Đại diện cho một lịch hẹn tiêm chủng.
 * Đây là một đối tượng dữ liệu đơn giản (Data Object) liên kết một NguoiDan,
 * một TrungTamTiemChung và thông tin về mũi tiêm.
 */
public class LichHenTiem {
    private final NguoiDan nguoiDan;
    private final TrungTamTiemChung trungTam;
    private final LocalDate ngayHen;
    private final Vaccine loaiVaccine;
    private final int muiSo;

    public LichHenTiem(NguoiDan nguoiDan, TrungTamTiemChung trungTam, LocalDate ngayHen, Vaccine loaiVaccine, int muiSo) {
        this.nguoiDan = nguoiDan;
        this.trungTam = trungTam;
        this.ngayHen = ngayHen;
        this.loaiVaccine = loaiVaccine;
        this.muiSo = muiSo;
    }

    // Getters
    public NguoiDan getNguoiDan() { return nguoiDan; }
    public TrungTamTiemChung getTrungTam() { return trungTam; }
    public Vaccine getLoaiVaccine() { return loaiVaccine; }
    public int getMuiSo() { return muiSo; }

    @Override
    public String toString() {
        return "LichHen[NguoiDan=" + nguoiDan.getHoTen() + ", TrungTam='" + trungTam.getTenTrungTam() +
                "', Ngay=" + ngayHen + ", MuiSo=" + muiSo + ", Loai=" + loaiVaccine.getTenVaccine() + "]";
    }
}