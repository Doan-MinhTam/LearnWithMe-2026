/**
 * Lớp public này đóng vai trò là container cho các lớp ngoại lệ của ứng dụng.
 * Việc có một lớp public trùng tên file giúp trình biên dịch nhận diện file một cách đáng tin cậy.
 */
public class VendingMachineExceptions {

    /**
     * Ném ra khi một sản phẩm được chọn đã hết hàng trong kho.
     * Đây là một lớp lồng nhau tĩnh (static nested class).
     */
    public static class SoldOutException extends RuntimeException {
        public SoldOutException() {
            super("Sản phẩm đã hết hàng");
        }

        public SoldOutException(String message) {
            super(message);
        }
    }

    /**
     * Ném ra khi số tiền khách hàng bỏ vào không đủ để mua sản phẩm đã chọn.
     */
    public static class NotEnoughMoneyException extends RuntimeException {
        public NotEnoughMoneyException() {
            super("Không đủ tiền");
        }

        public NotEnoughMoneyException(String message) {
            super(message);
        }
    }

    /**
     * Ném ra khi khách hàng bỏ vào một mệnh giá tiền không được máy chấp nhận.
     */
    public static class InvalidCoinException extends RuntimeException {
        public InvalidCoinException() {
            super("Tiền không hợp lệ");
        }

        public InvalidCoinException(String message) {
            super(message);
        }
    }
}