/**
 * Class PremiumAntique - Đồ cổ cao cấp
 * <p>
 * MÔ TẢ:
 * - Có 5 thuộc tính:
 * + itemId (String): Mã món đồ
 * + itemName (String): Tên món đồ
 * + rarityScore (double): Điểm độ hiếm từ 0 đến 10
 * + quantity (int): Số lượng
 * + insuranceFee (double): Phí bảo hiểm
 * <p>
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Cài đặt các phương thức:
 * - getItemId(), getItemName(), getRarityScore(), getQuantity()
 * - calculateTotalValue():
 * + Giá trị gốc = quantity * 2000000
 * + Tổng giá trị = giá trị gốc + insuranceFee
 * - canDisplayInExhibition(): true nếu quantity >= 2 và rarityScore >= 8.0
 * - getClassification(): giống RegularAntique-
 * getClassification():
 *  *        + rarityScore >= 9.0: "Cực hiếm"
 *  *        + rarityScore >= 8.0: "Hiếm"
 *  *        + rarityScore >= 6.5: "Khá hiếm"
 *  *        + rarityScore >= 5.0: "Bình thường"
 *  *        + còn lại: "Phổ biến"
 * 4. Override toString():
 * [ĐỒ CỔ CAO CẤP] Mã món: [itemId]
 * Tên món: [itemName]
 * Độ hiếm: [rarityScore]
 * Số lượng: [quantity]
 * Phí bảo hiểm: [insuranceFee] VNĐ
 */


class PremiumAntique implements Antique {
    // TODO
    private String itemId;
    private String itemName;
    private double rarityScore;
    private int quantity;
    private double insuranceFee;

    public PremiumAntique(String itemId, String itemName, double rarityScore, int quantity, double insuranceFee) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.rarityScore = rarityScore;
        this.quantity = quantity;
        this.insuranceFee = insuranceFee;
    }

    @Override
    public String getItemId() { return itemId; }

    @Override
    public String getItemName() { return itemName; }

    @Override
    public double getRarityScore() { return rarityScore; }

    @Override
    public int getQuantity() { return quantity; }

    @Override
    public double calculateTotalValue() {
        return quantity * 2000000 + insuranceFee;
    }

    @Override
    public boolean canDisplayInExhibition() {
        return quantity >= 2 && rarityScore >= 8.0;
    }

    @Override
    public String getClassification() {
        if (rarityScore >= 9.0) return "Cực hiếm";
        if (rarityScore >= 8.0) return "Hiếm";
        if (rarityScore >= 6.5) return "Khá hiếm";
        if (rarityScore >= 5.0) return "Bình thường";
        return "Phổ biến";
    }

    @Override
    public String toString() {
        return "[ĐỒ CỔ CAO CẤP] Mã món: " + itemId + "\n"
                + "Tên món: " + itemName + "\n"
                + "Độ hiếm: " + rarityScore + "\n"
                + "Số lượng: " + quantity + "\n"
                + "Phí bảo hiểm: " + insuranceFee + " VNĐ";
    }
}