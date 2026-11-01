/**
 * CLASS 1: Flight - Đại diện cho một chuyến bay
 * 
 * THUỘC TÍNH:
 * - flightNumber: String - Mã chuyến bay (format: 2 chữ cái + 4 số, VD: VN1234)
 * - airline: String - Hãng hàng không
 * - origin: String - Sân bay đi (mã IATA 3 chữ cái, VD: HAN)
 * - destination: String - Sân bay đến (mã IATA 3 chữ cái, VD: SGN)
 * - departureTime: String - Thời gian khởi hành (format: dd/MM/yyyy HH:mm)
 * - arrivalTime: String - Thời gian đến (format: dd/MM/yyyy HH:mm)
 * - economySeats: int - Số ghế hạng phổ thông
 * - businessSeats: int - Số ghế hạng thương gia
 * - firstClassSeats: int - Số ghế hạng nhất
 * - economyAvailable: int - Số ghế phổ thông còn trống
 * - businessAvailable: int - Số ghế thương gia còn trống
 * - firstClassAvailable: int - Số ghế hạng nhất còn trống
 * - economyPrice: double - Giá vé hạng phổ thông
 * - businessPrice: double - Giá vé hạng thương gia
 * - firstClassPrice: double - Giá vé hạng nhất
 * - status: String - Trạng thái (SCHEDULED, BOARDING, DEPARTED, ARRIVED, CANCELLED)
 * 
 * YÊU CẦU:
 * 1. Implement các interface: Reservable, Displayable, Validatable
 * 2. Constructor nhận các tham số: flightNumber, airline, origin, destination, 
 *    departureTime, arrivalTime, economySeats, businessSeats, firstClassSeats,
 *    economyPrice, businessPrice, firstClassPrice
 *    - economyAvailable = economySeats
 *    - businessAvailable = businessSeats
 *    - firstClassAvailable = firstClassSeats
 *    - status = "SCHEDULED"
 * 3. Implement phương thức reserve(String seatClass, int numberOfSeats):
 *    - Kiểm tra status phải là "SCHEDULED" hoặc "BOARDING"
 *    - Kiểm tra numberOfSeats > 0
 *    - Kiểm tra seatClass hợp lệ (ECONOMY, BUSINESS, FIRST_CLASS)
 *    - Kiểm tra còn đủ ghế trống cho seatClass đó
 *    - Giảm số ghế available tương ứng
 *    - Trả về true nếu thành công
 *    - Throw NoSeatsAvailableException nếu không đủ ghế
 * 4. Implement phương thức cancelReservation(String seatClass, int numberOfSeats):
 *    - Tăng số ghế available tương ứng
 *    - Không được vượt quá tổng số ghế ban đầu
 * 5. Implement phương thức getAvailableSeats(String seatClass):
 *    - Trả về số ghế còn trống theo seatClass
 * 6. Implement phương thức getDisplayInfo():
 *    - Format: "Flight [flightNumber] | [airline] | [origin] -> [destination] | Departure: [departureTime] | Arrival: [arrivalTime] | Status: [status] | Economy: [economyAvailable]/[economySeats] | Business: [businessAvailable]/[businessSeats] | First: [firstClassAvailable]/[firstClassSeats]"
 * 7. Implement phương thức isValid():
 *    - flightNumber match pattern "[A-Z]{2}\d{4}"
 *    - airline không null và không rỗng
 *    - origin và destination match pattern "[A-Z]{3}"
 *    - origin khác destination
 *    - departureTime và arrivalTime không null
 *    - economySeats, businessSeats, firstClassSeats >= 0
 *    - economyPrice, businessPrice, firstClassPrice > 0
 *    - status là một trong: SCHEDULED, BOARDING, DEPARTED, ARRIVED, CANCELLED
 * 8. Phương thức setStatus(String status): set status mới
 * 9. Phương thức getTotalSeats(): trả về tổng số ghế
 * 10. Phương thức getTotalAvailableSeats(): trả về tổng số ghế còn trống
 * 11. Phương thức getPrice(String seatClass): trả về giá vé theo hạng ghế
 * 12. Override toString() trả về getDisplayInfo()
 * 13. Tạo các getter cho tất cả thuộc tính
 */
public class Flight implements Reservable, Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này
    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int economySeats;
    private int businessSeats;
    private int firstClassSeats;
    private int economyAvailable;
    private int businessAvailable;
    private int firstClassAvailable;
    private double economyPrice;
    private double businessPrice;
    private double firstClassPrice;
    private String status;
    
    // Constructor
    public Flight(String flightNumber, String airline, String origin, String destination,
                 String departureTime, String arrivalTime, int economySeats, int businessSeats,
                 int firstClassSeats, double economyPrice, double businessPrice, double firstClassPrice) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.economySeats = economySeats;
        this.businessSeats = businessSeats;
        this.firstClassSeats = firstClassSeats;
        this.economyAvailable = economySeats;
        this.businessAvailable = businessSeats;
        this.firstClassAvailable = firstClassSeats;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.firstClassPrice = firstClassPrice;
        this.status = "SCHEDULED";
    }
    
    
}