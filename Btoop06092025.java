class Canh {
    private int a;
    private int b;
    public Canh(int x, int y) {
        if (x <= 0 || y <= 0) {
            System.out.println("Độ dài các cạnh phải là số nguyên dương");
            return;
        }
        this.a = x;
        this.b = y;
    }
    public int ChuVi() {
        return 2 * (a + b);
    }
    public int DienTich() {
        return a * b;
    }
}
public class Btoop06092025 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Chỉ nhập độ dài 2 cạnh");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Canh hcn = new Canh(a, b);
        System.out.println("Chu vi là " + hcn.ChuVi());
        System.out.println("Diện tích là " + hcn.DienTich());
    }
}
