package ss8s2_constructor.phan_so;

public class KiemTraPhanSo {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.outPut();

        PhanSo b = new PhanSo(1,2);
        b.outPut();

        PhanSo c = new PhanSo(3);
        c.outPut();

        PhanSo d = new PhanSo(-8,-2);
        d.outPut();
    }
}
