package QuanLySv;

public class SinhVien extends Nguoi  {
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, String ma, double diem) {
        super(ten, tuoi, ma);
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +super.toString()
                + "diem=" + diem + '}';
    }
}
