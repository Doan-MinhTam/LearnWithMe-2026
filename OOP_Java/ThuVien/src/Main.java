import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Đang đọc và khởi tạo dữ liệu từ file input.txt ---");

        // Tác giả
        TacGia nnAnh = new TacGia("TG01", "Nguyễn Nhật Ánh");
        TacGia rowling = new TacGia("TG02", "J.K. Rowling");
        TacGia namCao = new TacGia("TG03", "Nam Cao");

        // Sách
        ThuVien.themSach(new Sach("S001", "Cho Tôi Xin Một Vé Đi Tuổi Thơ", nnAnh));
        ThuVien.themSach(new Sach("S002", "Mắt Biếc", nnAnh));
        ThuVien.themSach(new Sach("S003", "Harry Potter và Hòn Đá Phù Thủy", rowling));
        ThuVien.themSach(new Sach("S004", "Lão Hạc", namCao));
        ThuVien.themSach(new Sach("S005", "Harry Potter và Phòng Chứa Bí Mật", rowling));

        // Độc giả
        ThuVien.dangKyDocGia(new DocGia("DG01", "Nguyễn Văn Nam"));
        ThuVien.dangKyDocGia(new DocGia("DG02", "Trần Thị Hoa"));
        ThuVien.dangKyDocGia(new DocGia("DG03", "Lê Thị Bình"));

        System.out.println("--- Dữ liệu đã sẵn sàng ---");


        System.out.println("\n--- BẮT ĐẦU TEST HÀM: choMuonSach ---");

        System.out.println("\n# Kịch bản 1: Mượn thành công");
        ThuVien.choMuonSach("S001", "DG01");

        System.out.println("\n# Kịch bản 2: Mượn sách không tồn tại");
        ThuVien.choMuonSach("S999", "DG01");

        System.out.println("\n# Kịch bản 3: Độc giả không tồn tại");
        ThuVien.choMuonSach("S002", "DG99");

        System.out.println("\n# Kịch bản 4: Mượn sách đã được người khác mượn");
        System.out.println("(Lần 1) Độc giả DG02 mượn sách S003:");
        ThuVien.choMuonSach("S003", "DG02");
        System.out.println("(Lần 2) Độc giả DG01 cố gắng mượn lại sách S003:");
        ThuVien.choMuonSach("S003", "DG01");

        System.out.println("\n--- KẾT THÚC TEST HÀM: choMuonSach ---");


        System.out.println("\n--- BẮT ĐẦU TEST HÀM: nhanTraSach ---");
    }
}