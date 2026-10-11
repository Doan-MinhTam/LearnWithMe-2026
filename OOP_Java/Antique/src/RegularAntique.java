import java.util.*;

/**
 * Class RegularAntique - Đồ cổ thường
 * <p>
 * MÔ TẢ:
 * - Có 4 thuộc tính:
 * + itemId (String): Mã món đồ
 * + itemName (String): Tên món đồ
 * + rarityScore (double): Điểm độ hiếm từ 0 đến 10
 * + quantity (int): Số lượng
 * <p>
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Cài đặt các phương thức:
 * - getItemId(), getItemName(), getRarityScore(), getQuantity()
 * - calculateTotalValue(): quantity * 2000000
 * - canDisplayInExhibition(): true nếu quantity >= 2 và rarityScore >= 8.0
 * - getClassification():
 * + rarityScore >= 9.0: "Cực hiếm"
 * + rarityScore >= 8.0: "Hiếm"
 * + rarityScore >= 6.5: "Khá hiếm"
 * + rarityScore >= 5.0: "Bình thường"
 * + còn lại: "Phổ biến"
 * 4. Override toString():
 * [ĐỒ CỔ THƯỜNG] Mã món: [itemId]
 * Tên món: [itemName]
 * Độ hiếm: [rarityScore]
 * Số lượng: [quantity]
 */
class RegularAntique implements Antique {
    // TODO
    private String itemId;
    private String itemName;
    private double rarityScore;
    private int quantity;


    public RegularAntique(String itemId, String itemName, double rarityScore, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.rarityScore = rarityScore;
        this.quantity = quantity;
    }

    @Override
    public String getItemId() {
        return itemId;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public double getRarityScore() {
        return rarityScore;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public double calculateTotalValue(){
        return quantity * 2000000;
    }

    public boolean canDisplayInExhibition(){
        if (quantity >= 2 && rarityScore >= 8.0) {
            return true;
        }
        return false;
    }

    public String getClassification(){
        if (rarityScore >= 9.0) return "Cực hiếm";
        if (rarityScore >= 8.0) return "Hiếm";
        if (rarityScore >= 6.5) return "Khá hiếm";
        if (rarityScore >= 5.0) return "Bình thường";
        return "Phổ biến";
    }

    @Override
    public String toString() {
        return "[ĐỒ CỔ THƯỜNG] Mã món: "+itemId+"\n" +
                "Tên món: "+itemName+"\n" +
                "Độ hiếm: "+rarityScore+"\n" +
                "Số lượng: "+quantity;
    }
}