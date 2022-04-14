package QuanLySv;

public class QuanLySVien implements QuanLy<SinhVien> {
    private SinhVien[] sv = new SinhVien[3];
    private int size = 0;


    @Override
    public void them(SinhVien sinhVien) {
        sv[size] = sinhVien;
        size++;
    }

    @Override
    public void sua(String ten, SinhVien sinhVien) {
        sv[timKiem(ten)] = sinhVien;
    }

    @Override
    public int timKiem(String ten) {
        for (int i = 0; i < size; i++) {
            if (ten == sv[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(sv[i]);
        }
        System.out.println("********");

    }
}
