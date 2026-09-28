import java.util.HashMap;
import java.util.Map;

/**
 * Đại diện cho một trung tâm/địa điểm tiêm chủng.
 * Mỗi trung tâm có tên, địa chỉ và kho vaccine riêng.
 * Việc quản lý kho (inventory) là một ví dụ thực tế về trạng thái của đối tượng.
 */
public class TrungTamTiemChung {
    private final String id;
    private String tenTrungTam;
    private String diaChi;
    // Sử dụng Map để lưu trữ số lượng của từng loại vaccine.
    private Map<Vaccine, Integer> khoVaccine;

    /**
     * Constructor để tạo một TrungTamTiemChung mới.
     *
     * @param id          ID duy nhất của trung tâm.
     * @param tenTrungTam Tên của trung tâm.
     * @param diaChi      Địa chỉ của trung tâm.
     */
    public TrungTamTiemChung(String id, String tenTrungTam, String diaChi) {
        this.id = id;
        this.tenTrungTam = tenTrungTam;
        this.diaChi = diaChi;
        this.khoVaccine = new HashMap<>();
    }

    // Getters
    public String getId() { return id; }
    public String getTenTrungTam() { return tenTrungTam; }
    public Map<Vaccine, Integer> getKhoVaccine() { return khoVaccine; }

    /**
     * Nhập thêm vaccine vào kho của trung tâm.
     *
     * @param vaccine Loại vaccine.
     * @param soLuong Số lượng cần thêm.
     */
    public void nhapKhoVaccine(Vaccine vaccine, int soLuong) {
        khoVaccine.put(vaccine, khoVaccine.getOrDefault(vaccine, 0) + soLuong);
        System.out.println("[KHO] Trung tâm " + tenTrungTam + ": Đã nhập " + soLuong + " liều " + vaccine.getTenVaccine());
    }

    /**
     * Kiểm tra xem trung tâm có đủ một loại vaccine cụ thể không.
     *
     * @param vaccine Loại vaccine cần kiểm tra.
     * @return true nếu có sẵn ít nhất 1 liều, ngược lại false.
     */
    public boolean coSanVaccine(Vaccine vaccine) {
        return khoVaccine.getOrDefault(vaccine, 0) > 0;
    }

    /**
     * Sử dụng một liều vaccine từ kho.
     *
     * @param vaccine Loại vaccine đã sử dụng.
     */
    public void suDungVaccine(Vaccine vaccine) {
        if (coSanVaccine(vaccine)) {
            khoVaccine.put(vaccine, khoVaccine.get(vaccine) - 1);
        }
    }

    @Override
    public String toString() {
        return "TrungTamTiemChung[ID=" + id + ", Ten='" + tenTrungTam + "', Kho=" + khoVaccine + "]";
    }
}