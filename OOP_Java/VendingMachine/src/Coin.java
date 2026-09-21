/**
 * Lớp Coin đại diện cho một mệnh giá tiền.
 * Lớp này cũng có một phương thức tĩnh để kiểm tra mệnh giá hợp lệ.
 */
public class Coin {

    private final long value;
    private static final long[] ACCEPTED_VALUES = {1000, 2000, 5000, 10000};

    public Coin(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    /**
     * [BÀI TẬP] Hoàn thiện hàm này.
     *
     * Yêu cầu:
     * 1. Kiểm tra xem giá trị 'value' được truyền vào có nằm trong danh sách
     *    các mệnh giá được chấp nhận (mảng 'ACCEPTED_VALUES') hay không.
     * 2. Trả về 'true' nếu 'value' là một mệnh giá hợp lệ.
     * 3. Trả về 'false' trong trường hợp ngược lại.
     *
     * Gợi ý: Sử dụng vòng lặp để duyệt qua mảng 'ACCEPTED_VALUES'.
     */
    public static boolean isValid(long value) {
        // TODO: Học sinh cần viết code ở đây
        for (long acceptedValue : ACCEPTED_VALUES) {
            if (value == acceptedValue) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coin coin = (Coin) obj;
        return value == coin.value;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(value);
    }
}