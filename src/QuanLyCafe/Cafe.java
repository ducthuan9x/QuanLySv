package QuanLyCafe;

public class Cafe {
    private String tenCafe;
    private double gia;
    private  double khoiLuong;

    public Cafe() {
    }

    public Cafe(String tenCafe, double gia, double khoiLuong) {
        this.tenCafe = tenCafe;
        this.gia = gia;
        this.khoiLuong = khoiLuong;
    }

    public String getTenCafe() {
        return tenCafe;
    }

    public void setTenCafe(String tenCafe) {
        this.tenCafe = tenCafe;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public double TinhTongTien(){
     return this.gia*this.khoiLuong;
    }
    public boolean KiemTRaKhoiLuong(double khoiLuong){
        return this.khoiLuong>khoiLuong;
    }
    public boolean KiemTraSoTienCoHon500k(){
        return this.TinhTongTien()>500000;
    }
    public double TinhSoTienGiamGia(double x){
        if(this.TinhTongTien()>800000){
            return TinhTongTien()*x/100;
        }
        else {
            return 0;
        }
    }
    public double TínhoTienSauKhiGiamGia(double x){
        return this.TinhTongTien()-this.TinhSoTienGiamGia(x);
    }
}
