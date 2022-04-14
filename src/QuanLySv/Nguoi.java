package QuanLySv;

public abstract class Nguoi {
    private String ten;
    private int tuoi;
    private String ma;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String ma) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.ma = ma;
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

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Override
    public String toString() {
        return
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", ma='" + ma + '\'' ;
    }
}
