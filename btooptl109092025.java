class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public void hienThi() {
        System.out.println("Hình chữ nhật: dài = " + chieuDai + ", rộng = " + chieuRong + ", chu vi = " + tinhChuVi() + ", diện tích = " + tinhDienTich());
    }
}
public class btooptl109092025 {
    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat(3, 6);
        HinhChuNhat h2 = new HinhChuNhat(4, 9);
        h1.hienThi();
        h2.hienThi();
    }
}
