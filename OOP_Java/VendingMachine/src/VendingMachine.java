public class VendingMachine {

    private Inventory<Item> itemInventory = new Inventory<>();
    private Inventory<Coin> cashInventory = new Inventory<>();
    private long currentBalance = 0;
    private Item selectedItem = null;

    public VendingMachine() {
        initialize();
    }

    private void initialize() {
        for (Item item : ProductCatalog.getAllItems()) {
            itemInventory.put(item, 5);
        }
    }

    /**
     * [BÀI TẬP] Lấy danh sách sản phẩm dưới dạng chuỗi.
     * • Định dạng mỗi dòng: "[Tên]: [Giá] VND (Còn lại: [Số lượng])"
     * • Số lượng item thì sử dụng phương thức getQuantity() của Inventory
     */
    public String getProductsInfo() {
        // TODO: Sinh viên duyệt ProductCatalog.getAllItems() và nối chuỗi (thêm ký tự đặc biệt xuống dòng)
        StringBuilder sb = new StringBuilder();
        for (Item item : ProductCatalog.getAllItems()) {
            int quantity = itemInventory.getQuantity(item);
            sb.append(item.getName()).append(": ").append(item.getPrice())
                    .append(" VND (Còn lại: ").append(quantity).append(")\n");
        }
        return sb.toString();
    }

    /**
     * [BÀI TẬP] Chọn sản phẩm.
     * • Return Chuỗi thông báo: "Đã chọn [Tên] - Giá: [Giá] VND"
     * • Throws VendingMachineExceptions.SoldOutException nếu hết hàng.
     */
    public String selectItem(Item item) throws VendingMachineExceptions.SoldOutException {
        // TODO: Sinh viên kiên tra itemInventory.hasItem(item)
        // • Nếu còn: gán selectedItem = item và trả về thông báo.
        // • Nếu hết: ném ngoại lệ SoldOutException.
        if (itemInventory.hasItem(item)) {
            selectedItem = item;
            return "Đã chọn " + item.getName() + " - Giá: " + item.getPrice() + " VND";
        } else {
            throw new VendingMachineExceptions.SoldOutException();
        }
    }

    /**
     * [BÀI TẬP] Bỏ tiền vào máy.
     * • Return Chuỗi thông báo: "Đã bỏ vào: [Mệnh giá] - Số dư hiện tại: [Tổng số dư]"
     * • Throws VendingMachineExceptions.InvalidCoinException nếu tiền không hợp lệ.
     */
    public String insertCoin(long value) throws VendingMachineExceptions.InvalidCoinException {
        // TODO: Kiểm tra Coin.isValid(value).
        // • Nếu hợp lệ: cộng currentBalance, add vào cashInventory và trả về thông báo.
        if (Coin.isValid(value)) {
            Coin coin = new Coin(value);
            cashInventory.add(coin);
            currentBalance += value;
            return "Đã bỏ vào: " + value + " - Số dư hiện tại: " + currentBalance;
        } else {
            throw new VendingMachineExceptions.InvalidCoinException();
        }
    }

    /**
     * [BÀI TẬP] Thực hiện giao dịch.
     * • gọi itemInventory.deduct(selectedItem) để giảm số lượng item trong máy
     * • Return Chuỗi thông báo: "Giao dịch thành công - Tiền thừa: [Số tiền thừa] VND"
     * • Throws VendingMachineExceptions.NotEnoughMoneyException nếu thiếu tiền.
     */
    public String executeTransaction() throws VendingMachineExceptions.NotEnoughMoneyException {
        // TODO: Kiểm tra selectedItem != null và currentBalance >= price.
        // • Trả kho, tính tiền thừa, gọi resetTransaction() và trả về thông báo.
        if (selectedItem != null && currentBalance >= selectedItem.getPrice()) {
            itemInventory.deduct(selectedItem);
            long change = currentBalance - selectedItem.getPrice();
            resetTransaction();
            return "Giao dịch thành công - Tiền thừa: " + change + " VND";
        } else {
            throw new VendingMachineExceptions.NotEnoughMoneyException();
        }
    }

    /**
     * [BÀI TẬP] Hủy giao dịch.
     * • Return Chuỗi thông báo: "Giao dịch đã bị hủy - Hoàn lại: [Số tiền] VND"
     */
    public String cancelTransaction() {
        // TODO: Lưu lại currentBalance vào biến tạm, gọi resetTransaction() và trả về thông báo.
        long refund = currentBalance;
        resetTransaction();
        return "Giao dịch đã bị hủy - Hoàn lại: " + refund + " VND";
    }

    private void resetTransaction() {
        currentBalance = 0;
        selectedItem = null;
    }
}