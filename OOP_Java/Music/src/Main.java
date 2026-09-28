import java.util.List;
import java.util.Scanner;

public class Main {

    private static Playlist plVPop;
    private static Playlist plUsUk;

    private static void khoiTaoDuLieu() {
        // Nghệ sĩ
        NgheSi sonTung = new NgheSi("NS01", "Sơn Tùng M-TP");
        NgheSi taylor = new NgheSi("NS02", "Taylor Swift");
        NgheSi edSheeran = new NgheSi("NS03", "Ed Sheeran");
        DichVuAmNhac.themNgheSi(sonTung);
        DichVuAmNhac.themNgheSi(taylor);
        DichVuAmNhac.themNgheSi(edSheeran);

        // Bài hát
        BaiHat b1 = new BaiHat("BH01", "Hãy Trao Cho Anh", sonTung, 255);
        BaiHat b2 = new BaiHat("BH02", "Nơi Này Có Anh", sonTung, 261);
        BaiHat b3 = new BaiHat("BH03", "Blank Space", taylor, 231);
        BaiHat b4 = new BaiHat("BH04", "Lover", taylor, 221);
        BaiHat b5 = new BaiHat("BH05", "Shape of You", edSheeran, 233);
        DichVuAmNhac.themBaiHat(b1);
        DichVuAmNhac.themBaiHat(b2);
        DichVuAmNhac.themBaiHat(b3);
        DichVuAmNhac.themBaiHat(b4);
        DichVuAmNhac.themBaiHat(b5);

        // Người dùng
        NguoiDung an = new NguoiDung("ND01", "An");
        NguoiDung binh = new NguoiDung("ND02", "Bình");
        DichVuAmNhac.themNguoiDung(an);
        DichVuAmNhac.themNguoiDung(binh);

        // Playlist của An
        plVPop = DichVuAmNhac.taoPlaylist("Nhạc V-Pop Hay Nhất", an);
    }
}