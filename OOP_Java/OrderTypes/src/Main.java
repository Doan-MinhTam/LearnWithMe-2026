/**
 * Bài tập 2: Order Types - Lệnh giới hạn và Lệnh thị trường
 * 1. Yêu cầu nghiệp vụ
 * Phân biệt hai loại lệnh cơ bản trong giao dịch.
 *
 * A. Lớp Order (Cha)
 * Thuộc tính: orderId, symbol, quantity.
 * Phương thức trừu tượng: double getExecutionPrice(double currentMarketPrice).
 * B. Lớp LimitOrder (Con)
 * Thuộc tính riêng: limitPrice (Mức giá mong muốn).
 * Logic: getExecutionPrice trả về limitPrice. (Lệnh chỉ khớp ở giá đã đặt).
 * C. Lớp MarketOrder (Con)
 * Logic: getExecutionPrice trả về currentMarketPrice. (Lệnh khớp ngay lập tức theo giá thị trường).
 * 2. Lớp JAVA_OOP_302.java
 * Mô phỏng việc khớp lệnh: Nhập một giá thị trường hiện tại, sau đó kiểm tra danh sách lệnh để xem mỗi lệnh sẽ được thực thi ở mức giá nào.
 */