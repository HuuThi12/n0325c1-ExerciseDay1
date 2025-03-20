package ss8s2_constructor.phan_so;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor mặc định: Khởi tạo phân số với tử số 0 và mẫu số là 1
    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo) {
        this.tuSo = tuSo;
        mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private void rutGon() {
        int ucln = UocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
        rutGon();
    }

    private int UocChungLonNhat(int a, int b) {
        if (a == b || b == 0) {
            return 1;
        }

        a = Math.abs(a);

        for (int i = 1; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void outPut() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    // Phương thức sao chép
    public PhanSo copy() {
        return new PhanSo(tuSo, mauSo);
    }

    public void cong(int value) {
        tuSo += value * mauSo;
        rutGon();
    }

}
