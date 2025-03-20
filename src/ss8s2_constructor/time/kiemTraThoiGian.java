package ss8s2_constructor.time;

public class kiemTraThoiGian {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.outPut();

        ThoiGian b = new ThoiGian(7);
        b.outPut();

        ThoiGian c= new ThoiGian(7,30);
        c.outPut();

        ThoiGian d = new ThoiGian(7,30,50);
        d.outPut();

        ThoiGian e = new ThoiGian(d);
        e.outPut();

    }
}
