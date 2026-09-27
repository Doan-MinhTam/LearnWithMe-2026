import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // =========================
        // 1. Tạo Cinema
        // =========================

        Cinema cinema = new Cinema("CGV");

        // =========================
        // 2. Tạo Movie
        // =========================

        Movie movie1 = new Movie(
                "Lật Mặt 7",
                "Gia đình",
                130
        );

        Movie movie2 = new Movie(
                "Doraemon: Nobita và Bản giao hưởng Địa Cầu",
                "Hoạt hình",
                110
        );

        cinema.addMovie(movie1);
        cinema.addMovie(movie2);

        // =========================
        // 3. Tạo Showtime
        // =========================

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Showtime showtime1 = new Showtime(
                movie1,
                LocalDateTime.parse(
                        "2024-05-20 19:30",
                        formatter
                )
        );

        Showtime showtime2 = new Showtime(
                movie1,
                LocalDateTime.parse(
                        "2024-05-20 21:00",
                        formatter
                )
        );

        Showtime showtime3 = new Showtime(
                movie2,
                LocalDateTime.parse(
                        "2024-05-20 18:00",
                        formatter
                )
        );

        cinema.addShowtime(showtime1);
        cinema.addShowtime(showtime2);
        cinema.addShowtime(showtime3);

        // =========================
        // 4. Hiển thị sơ đồ ghế ban đầu
        // =========================

        System.out.print(showtime1.getSeatMap());

        // =========================
        // 5. Kịch bản 1
        // Đặt C4, C5
        // =========================

        Ticket ticket1 = cinema.bookTickets(
                showtime1,
                Arrays.asList("C4", "C5")
        );

        if (ticket1 != null) {
            System.out.println("Đặt vé thành công!");
            System.out.println(ticket1.getTicketDetails());
        } else {
            System.out.println(
                    "Đặt vé thất bại: Ghế không tồn tại hoặc đã có người đặt."
            );
        }

        // =========================
        // 6. Hiển thị lại sơ đồ ghế
        // =========================

        System.out.print(showtime1.getSeatMap());

        // =========================
        // 7. Kịch bản 2
        // D5 còn trống nhưng C5 đã đặt
        // =========================

        System.out.println("[D5, C5]");

        Ticket ticket2 = cinema.bookTickets(
                showtime1,
                Arrays.asList("D5", "C5")
        );

        if (ticket2 != null) {
            System.out.println("Đặt vé thành công!");
            System.out.println(ticket2.getTicketDetails());
        } else {
            System.out.println(
                    "Đặt vé thất bại: Ghế không tồn tại hoặc đã có người đặt."
            );
        }

        // =========================
        // 8. Kịch bản 3
        // Z9 không tồn tại
        // =========================

        System.out.println("[Z9, A1]");

        Ticket ticket3 = cinema.bookTickets(
                showtime1,
                Arrays.asList("Z9", "A1")
        );

        if (ticket3 != null) {
            System.out.println("Đặt vé thành công!");
            System.out.println(ticket3.getTicketDetails());
        } else {
            System.out.println(
                    "Đặt vé thất bại: Ghế không tồn tại hoặc đã có người đặt."
            );
        }
    }
}
