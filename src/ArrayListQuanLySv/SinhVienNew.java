package ArrayListQuanLySv;

public class SinhVienNew {
    private String ten;
    private int tuoi;
    private String iD;
    private  double diemTrungBinh;

    public SinhVienNew() {
    }

    public SinhVienNew(String iD) {
        this.iD = iD;
    }

    public SinhVienNew(String ten, int tuoi, String iD, double diemTrungBinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.iD = iD;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVienNew{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", iD='" + iD + '\'' +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
