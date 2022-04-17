package QuanLyCafe;

public class Main {
    public static void main(String[] args) {
        Cafe cf1=new Cafe("Trung Nghuyên",200000,5);
        Cafe cf2=new Cafe("Capuchino",300000,1);
        Cafe cf3=new Cafe("Ness",80000,3);
        System.out.println(cf1.TinhTongTien());
        System.out.println(cf2.TinhTongTien());
        System.out.println(cf3.TinhTongTien());
        System.out.println("kiểm tra xem khối lượng có lớn hơn 3 kg " + cf2.KiemTRaKhoiLuong(3));
        System.out.println("kiểm tra số tiền có lớn hơn 500k "+cf3.KiemTraSoTienCoHon500k());
        System.out.println("kiểm tra số tiền có lớn hơn 500k "+cf1.KiemTraSoTienCoHon500k());
        System.out.println("tính tiền giảm giá 5% "+ cf1.TinhSoTienGiamGia(5));
        System.out.println("số tiền còn lại sau giảm giá " + cf1.TínhoTienSauKhiGiamGia(5));
    }
}
