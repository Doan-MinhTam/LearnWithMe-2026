/**
 * Interface cho đối tượng có thể điều trị
 */
public interface Treatable {
    /**
     * Khám bệnh
     * @param doctor Tên bác sĩ
     * @param diagnosis Chẩn đoán
     * @throws PatientDischargedException nếu bệnh nhân đã xuất viện
     */
    void examine(String doctor, String diagnosis) throws PatientDischargedException, 
                                                         InvalidMedicalRecordException;
    
    /**
     * Kê đơn thuốc
     * @param medication Tên thuốc
     * @param dosage Liều lượng
     */
    void prescribeMedication(String medication, String dosage) throws PatientDischargedException;
    
    /**
     * Xuất viện
     */
    void discharge();
}