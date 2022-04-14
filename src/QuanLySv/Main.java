package QuanLySv;

public class Main {
    public static void main(String[] args) {
        QuanLySVien qlsv = new QuanLySVien();
        SinhVien sv1 = new SinhVien("Nguyễn Văn A", 22, "Cv1122", 8);
        SinhVien sv2 = new SinhVien("Nguyễn Văn B", 23, "Cv1123", 9);
        SinhVien sv3 = new SinhVien("Nguyễn Văn C", 24, "Cv1124", 10);


        qlsv.them(sv1);
        qlsv.them(sv2);
        qlsv.them(sv3);
        qlsv.hienThi();
        System.out.println(qlsv.timKiem("Nguyễn Văn B"));

        SinhVien sv4 = new SinhVien("Nguyễn Văn D", 25, "Cv1125", 6.5);
        qlsv.sua("Nguyễn Văn B", sv4);
        qlsv.hienThi();

    }
}
