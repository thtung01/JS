class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private static int tongSV = 0;
    public SinhVien(String maSV, String hoTen, int tuoi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        tongSV++;
    }
    public void hienThi() {
        System.out.println("Mã SV: " + maSV + ", Họ tên: " + hoTen + ", Tuổi: " + tuoi);
    }
    public static void hienThiTongSV() {
        System.out.println("Tổng số sinh viên: " + tongSV);
    }
}
public class btooptl209092025 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Thanh Tung", 17);
        SinhVien sv2 = new SinhVien("SV002", "Hoang Son", 29);
        SinhVien sv3 = new SinhVien("SV003", "Bui Hoang Hiep", 15);
        SinhVien sv4 = new SinhVien("SV004", "Le Tuan Minh", 36);
        sv1.hienThi();
        sv2.hienThi();
        sv3.hienThi();
        sv4.hienThi();
        SinhVien.hienThiTongSV();
    }
}
