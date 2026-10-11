/**
 * Interface Antique - Đại diện cho một món đồ cổ
 *
 * Các phương thức cần có:
 * - getItemId(): trả về mã món đồ
 * - getItemName(): trả về tên món đồ
 * - getRarityScore(): trả về điểm độ hiếm
 * - getQuantity(): trả về số lượng
 * - calculateTotalValue(): trả về tổng giá trị
 * - canDisplayInExhibition(): kiểm tra có đủ điều kiện trưng bày không
 * - getClassification(): trả về xếp loại
 */
interface Antique {
    String getItemId();
    String getItemName();
    double getRarityScore();
    int getQuantity();
    double calculateTotalValue();
    boolean canDisplayInExhibition();
    String getClassification();
}