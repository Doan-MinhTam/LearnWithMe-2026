/**
 * CLASS 2: Booking - Đại diện cho một đặt vé
 * 
 * THUỘC TÍNH:
 * - bookingId: String - Mã đặt vé (duy nhất, format: BK + 8 số)
 * - passengerName: String - Tên hành khách
 * - passportNumber: String - Số hộ chiếu/CMND (6-12 ký tự)
 * - email: String - Email liên hệ
 * - phoneNumber: String - Số điện thoại (10-11 số)
 * - flight: Flight - Chuyến bay
 * - seatClass: String - Hạng ghế (ECONOMY, BUSINESS, FIRST_CLASS)
 * - numberOfSeats: int - Số ghế đặt
 * - totalPrice: double - Tổng giá vé
 * - bookingDate: String - Ngày đặt vé (format: dd/MM/yyyy HH:mm)
 * - status: String - Trạng thái (CONFIRMED, CANCELLED, CHECKED_IN)
 * - seatNumbers: String - Số ghế (VD: "12A, 12B")
 * 
 * YÊU CẦU:
 * 1. Implement các interface: Displayable, Validatable, Priceable
 * 2. Constructor nhận các tham số: bookingId, passengerName, passportNumber, email,
 *    phoneNumber, flight, seatClass, numberOfSeats
 *    - totalPrice = flight.getPrice(seatClass) * numberOfSeats
 *    - bookingDate = thời gian hiện tại
 *    - status = "CONFIRMED"
 *    - seatNumbers = "" (sẽ gán khi check-in)
 * 3. Implement phương thức getDisplayInfo():
 *    - Format: "Booking [bookingId] | Passenger: [passengerName] | Flight: [flight.getFlightNumber()] | Class: [seatClass] | Seats: [numberOfSeats] | Price: [totalPrice] VND | Status: [status] | Booking Date: [bookingDate]"
 * 4. Implement phương thức isValid():
 *    - bookingId match pattern "BK\d{8}"
 *    - passengerName không null và không rỗng
 *    - passportNumber có độ dài 6-12
 *    - email chứa '@'
 *    - phoneNumber có độ dài 10-11 và chỉ chứa số
 *    - flight không null và flight.isValid() == true
 *    - seatClass là một trong: ECONOMY, BUSINESS, FIRST_CLASS
 *    - numberOfSeats > 0
 *    - totalPrice > 0
 *    - status là một trong: CONFIRMED, CANCELLED, CHECKED_IN
 * 5. Implement calculatePrice():
 *    - Trả về flight.getPrice(seatClass) * numberOfSeats
 * 6. Phương thức cancel():
 *    - Kiểm tra status == "CONFIRMED"
 *    - Kiểm tra flight.getStatus() không phải "DEPARTED" hoặc "ARRIVED"
 *    - Gọi flight.cancelReservation() để hoàn lại ghế
 *    - Set status = "CANCELLED"
 *    - Throw InvalidBookingException nếu không thể hủy
 * 7. Phương thức checkIn(String seatNumbers):
 *    - Kiểm tra status == "CONFIRMED"
 *    - Kiểm tra flight.getStatus() == "BOARDING"
 *    - Set this.seatNumbers = seatNumbers
 *    - Set status = "CHECKED_IN"
 *    - Throw FlightDepartedException nếu không thể check-in
 * 8. Phương thức getFlightDetails():
 *    - Trả về thông tin chi tiết chuyến bay
 * 9. Override toString() trả về getDisplayInfo()
 * 10. Tạo các getter cho tất cả thuộc tính
 */
public class Booking implements Displayable, Validatable, Priceable {
    // TODO: Sinh viên hoàn thiện class này
    private String bookingId;
    private String passengerName;
    private String passportNumber;
    private String email;
    private String phoneNumber;
    private Flight flight;
    private String seatClass;
    private int numberOfSeats;
    private double totalPrice;
    private String bookingDate;
    private String status;
    private String seatNumbers;
    
    // Constructor
    public Booking(String bookingId, String passengerName, String passportNumber, String email,
                  String phoneNumber, Flight flight, String seatClass, int numberOfSeats) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.flight = flight;
        this.seatClass = seatClass;
        this.numberOfSeats = numberOfSeats;
        this.totalPrice = flight.getPrice(seatClass) * numberOfSeats;
        this.bookingDate = "02/11/2025 15:55";
        this.status = "CONFIRMED";
        this.seatNumbers = "";
    }

    @Override
    public String getDisplayInfo() {
        return "Booking " + bookingId + " | Passenger: " + passengerName
                + " | Flight: " + flight.getFlightNumber() + " | Class: " + seatClass
                + " | Seats: " + numberOfSeats + " | Price: " + totalPrice + " VND"
                + " | Status: " + status + " | Booking Date: " + bookingDate;
    }


}