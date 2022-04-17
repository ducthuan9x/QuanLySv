package TestQuanLyDanhSach;

import ArrayListQuanLySv.QuanLyDanhSach;
import ArrayListQuanLySv.SinhVienNew;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner=new Scanner((System.in));
            QuanLyDanhSach qlsv=new QuanLyDanhSach();
            int luaChon =0;

            do {

                System.out.println("chon MeNU");
                System.out.println("1 :thêm danh sách sv");
                System.out.println("2 :kiểm tra sinh viên có trong danh sách ko");
                System.out.println("3 :sửa thông tin sinh viên");
                System.out.println("4 :xoá sv khỏi ds");
                System.out.println("5 :sắp xếp sv theo điểm trung bình");
                System.out.println("0 :thoát khỏi menu");
                luaChon=scanner.nextInt();
                scanner.nextLine();

                if(luaChon==1){
//       thêm sv vào danh sách
                    System.out.println("nhập tên sinh viên"); String ten=scanner.nextLine();
                    System.out.println("nhập tuổi sinh viên"); int tuoi=scanner.nextInt();scanner.nextLine();
                    System.out.println("nhập ID sinh viên"); String iD=scanner.nextLine();
                    System.out.println("nhập điểm trung bình sinh viên"); double diemTrungBinh=scanner.nextDouble();
                    SinhVienNew sv=new SinhVienNew(ten,tuoi,iD,diemTrungBinh);
                    qlsv.them(sv);
                    qlsv.hienThi();
                }

//      kiểm tra xem sv có trong danh sách hay ko
                if(luaChon==2){
                    System.out.println("nhập ID sinh viên"); String iD=scanner.nextLine();
                  SinhVienNew sv=new SinhVienNew(iD);
                    System.out.println("kiểm tra tồn tại của sv co ID "+ qlsv.kiemTra(sv));
                }

                if(luaChon==3){
//        sửa thông tin sv

                    System.out.print("nhập ID sinh viên"); String iD1=scanner.nextLine();
                    System.out.println("nhập tên sinh viên"); String ten=scanner.nextLine();
                    System.out.println("nhập tuổi sinh viên"); int tuoi=scanner.nextInt();scanner.nextLine();
                    System.out.println("nhập ID sinh viên"); String iD=scanner.nextLine();
                    System.out.println("nhập điểm trung bình sinh viên"); double diemTrungBinh=scanner.nextDouble();
                    SinhVienNew sv1=new SinhVienNew(ten,tuoi,iD,diemTrungBinh);
                    qlsv.sua(iD1,sv1);
                    qlsv.hienThi();
                }
                if(luaChon==4){
//        xoá sinh viên khỏi ds
                    System.out.println("nhập ID sinh viên"); String iD=scanner.nextLine();
                    qlsv.xoaSv(iD);
                    qlsv.hienThi();
                }
                if(luaChon==5){
//       sắp xếp theo điểm trung bình
                    qlsv.sapXepTheoDiemTrungBinh();
                    qlsv.hienThi();
                }
            }while (luaChon!=0);
        }
    }

