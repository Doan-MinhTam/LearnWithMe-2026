import java.util.List;

public class Ticket {
    private final String ticketId;
    private final Showtime showtime;
    private final List<Seat> bookedSeats;
    private final double totalPrice;
    private static int count = 1;
    private static final double PRICE_PER_SEAT = 80000;

    public Ticket(Showtime showtime, List<Seat> bookedSeats) {
        this.ticketId = "" + count++;
        this.showtime = showtime;
        this.bookedSeats = bookedSeats;
        this.totalPrice = bookedSeats.size() * PRICE_PER_SEAT;
    }

    /**
     * Trả về thông tin vé dưới dạng chuỗi.
     */
    public String getTicketDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mã vé: ").append(ticketId).append("\n");
        sb.append("Phim: ").append(showtime.getMovie().getTitle()).append("\n");
        sb.append("Suất chiếu: ").append(showtime.getFormattedShowtime()).append("\n");
        sb.append("Ghế: ");
        for (Seat s : bookedSeats) sb.append(s.getSeatNumber()).append(" ");
        sb.append(String.format("\nTổng tiền: %,.0f VND", totalPrice));
        return sb.toString();
    }
}