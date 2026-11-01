import javax.sound.midi.MidiFileFormat;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

/**
 * CLASS 1: Flight - Đại diện cho một chuyến bay
 * <p>
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
 * <p>
 * YÊU CẦU:
 * 1. Implement các interface: Reservable, Displayable, Validatable
 * 2. Constructor nhận các tham số: flightNumber, airline, origin, destination,
 * departureTime, arrivalTime, economySeats, businessSeats, firstClassSeats,
 * economyPrice, businessPrice, firstClassPrice
 * - economyAvailable = economySeats
 * - businessAvailable = businessSeats
 * - firstClassAvailable = firstClassSeats
 * - status = "SCHEDULED"
 * 3. Implement phương thức reserve(String seatClass, int numberOfSeats):
 * - Kiểm tra status phải là "SCHEDULED" hoặc "BOARDING"
 * - Kiểm tra numberOfSeats > 0
 * - Kiểm tra seatClass hợp lệ (ECONOMY, BUSINESS, FIRST_CLASS)
 * - Kiểm tra còn đủ ghế trống cho seatClass đó
 * - Giảm số ghế available tương ứng
 * - Trả về true nếu thành công
 * - Throw NoSeatsAvailableException nếu không đủ ghế
 * 4. Implement phương thức cancelReservation(String seatClass, int numberOfSeats):
 * - Tăng số ghế available tương ứng
 * - Không được vượt quá tổng số ghế ban đầu
 * 5. Implement phương thức getAvailableSeats(String seatClass):
 * - Trả về số ghế còn trống theo seatClass
 * 6. Implement phương thức getDisplayInfo():
 * - Format: "Flight [flightNumber] | [airline] | [origin] -> [destination] | Departure: [departureTime] | Arrival: [arrivalTime] | Status: [status] | Economy: [economyAvailable]/[economySeats] | Business: [businessAvailable]/[businessSeats] | First: [firstClassAvailable]/[firstClassSeats]"
 * 7. Implement phương thức isValid():
 * - flightNumber match pattern "[A-Z]{2}\d{4}"
 * - airline không null và không rỗng
 * - origin và destination match pattern "[A-Z]{3}"
 * - origin khác destination
 * - departureTime và arrivalTime không null
 * - economySeats, businessSeats, firstClassSeats >= 0
 * - economyPrice, businessPrice, firstClassPrice > 0
 * - status là một trong: SCHEDULED, BOARDING, DEPARTED, ARRIVED, CANCELLED
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

    @Override
    public String getDisplayInfo() {
        return "Flight " + flightNumber + " | " + airline + " | " + origin + " -> " + destination + " | Departure: " + departureTime + " | Arrival: " + arrivalTime + " | Status: " + status + " | Economy: " + economyAvailable + "/" + economySeats + " | Business: " + businessAvailable + "/" + businessSeats + " | First: " + firstClassAvailable + "/" + firstClassSeats;

    }

    @Override
    public boolean reserve(String seatClass, int numberOfSeats) throws NoSeatsAvailableException {
        if (!status.equals("SCHEDULED") && !status.equals("BOARDING")) return false;
        if (numberOfSeats <= 0) return false;
        if (!(seatClass.equals("ECONOMY") || seatClass.equals("BUSINESS") || seatClass.equals("FIRST_CLASS")))
            return false;
        if (getAvailableSeats(seatClass) < numberOfSeats) {
            throw new NoSeatsAvailableException("Not enough " + seatClass + " seats on flight " + flightNumber);
        }
        switch (seatClass) {
            case "ECONOMY":
                economyAvailable -= numberOfSeats;
                break;
            case "BUSINESS":
                businessAvailable -= numberOfSeats;
                break;
            default:
                firstClassAvailable -= numberOfSeats;
                break;
        }
        return true;
    }

    @Override
    public void cancelReservation(String seatClass, int numberOfSeats) {
        switch (seatClass) {
            case "ECONOMY":
                economyAvailable = Math.min(economySeats, economyAvailable + numberOfSeats);
                break;
            case "BUSINESS":
                businessAvailable = Math.min(businessSeats, businessAvailable + numberOfSeats);
                break;
            default:
                firstClassAvailable = Math.min(firstClassSeats, firstClassAvailable + numberOfSeats);
                break;
        }
    }

    @Override
    public int getAvailableSeats(String seatClass) {
        if (seatClass == null) {
            return 0;
        }
        switch (seatClass) {
            case "ECONOMY":
                return economyAvailable;
            case "BUSINESS":
                return businessAvailable;
            case "FIRST_CLASS":
                return firstClassAvailable;
            default:
                return 0;
        }
    }

    @Override
    public boolean isValid() {
        if (!flightNumber.matches("[A-Z]{2}\\d{4}")) return false;
        if (airline == null || airline.isEmpty()) return false;
        if (!origin.matches("[A-Z]{3}")) return false;
        if (!destination.matches("[A-Z]{3}")) return false;
        if (origin.equals(destination)) return false;
        if (departureTime == null || arrivalTime == null) return false;
        if (economySeats < 0 || businessSeats < 0 || firstClassSeats < 0) return false;
        if (economyPrice <= 0 || businessPrice <= 0 || firstClassPrice <= 0) return false;

        return status.equals("SCHEDULED") || status.equals("BOARDING") || status.equals("DEPARTED") || status.equals("ARRIVED") || status.equals("CANCELLED");
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalSeats(){
        return economySeats +businessSeats +firstClassSeats;
    }

    public int getTotalAvailableSeats(){
        return economyAvailable +businessAvailable +firstClassAvailable;
    }

    public double getPrice(String seatClass) {
        if (seatClass == null) {
            return 0;
        }
        switch (seatClass) {
            case "ECONOMY":
                return economyPrice;
            case "BUSINESS":
                return businessPrice;
            case "FIRST_CLASS":
                return firstClassPrice;
            default:
                return 0;
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public int getFirstClassSeats() {
        return firstClassSeats;
    }

    public int getEconomyAvailable() {
        return economyAvailable;
    }

    public int getBusinessAvailable() {
        return businessAvailable;
    }

    public int getFirstClassAvailable() {
        return firstClassAvailable;
    }

    public double getEconomyPrice() {
        return economyPrice;
    }

    public double getBusinessPrice() {
        return businessPrice;
    }

    public double getFirstClassPrice() {
        return firstClassPrice;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return getDisplayInfo();
    }
}