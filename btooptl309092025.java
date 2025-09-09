import java.util.*;
class TaiKhoan {
    private String soTK;
    private String tenChuTK;
    private double soDu;
    private static double laiSuatNam = 0.05;
    public TaiKhoan(String soTK, String tenChuTK, double soDu) {
        this.soTK = soTK;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }
    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp thành công: " + soTien);
        }
    }
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công: " + soTien);
        } else {
            System.out.println("Rút thất bại!");
        }
    }
    public void tinhLaiThang() {
        double lai = soDu * (laiSuatNam / 12);
        soDu += lai;
    }
    public void hienThi() {
        System.out.println("Số TK: " + soTK + ", Chủ TK: " + tenChuTK + ", Số dư: " + soDu);
    }
    public static void thayDoiLaiSuat(double laiSuatMoi) {
        laiSuatNam = laiSuatMoi;
    }
    public static void hienThiLaiSuat() {
        System.out.println("Lãi suất năm hiện tại: " + (laiSuatNam * 100) + "%");
    }
    public double getSoDu() {
        return soDu;
    }
    public String getSoTK() {
        return soTK;
    }
}
public class btooptl309092025 {
    public static void main(String[] args) {
        ArrayList<TaiKhoan> ds = new ArrayList<>();
        ds.add(new TaiKhoan("001", "Nguyen Thanh Tung", 1789));
        ds.add(new TaiKhoan("002", "Le Tuan Minh", 36));
        ds.add(new TaiKhoan("003", "Bui Hoang Hipe", 1534));
        ds.add(new TaiKhoan("004", "Hoang Son", 2930));

        ds.get(0).napTien(2000);
        ds.get(1).rutTien(3000);
        ds.get(2).tinhLaiThang();

        System.out.println("\n--- Danh sách tài khoản ---");
        for (TaiKhoan tk : ds) {
            tk.hienThi();
        }

        TaiKhoan.thayDoiLaiSuat(0.07);
        TaiKhoan.hienThiLaiSuat();

        String tim = "002";
        for (TaiKhoan tk : ds) {
            if (tk.getSoTK().equals(tim)) {
                System.out.println("\nTìm thấy tài khoản:");
                tk.hienThi();
            }
        }

        ds.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));

        System.out.println("\n--- Danh sách sau khi sắp xếp ---");
        for (TaiKhoan tk : ds) {
            tk.hienThi();
        }
    }
}
