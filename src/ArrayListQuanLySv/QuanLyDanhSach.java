package ArrayListQuanLySv;

import java.util.*;

public class QuanLyDanhSach {
    private ArrayList<SinhVienNew> danhSach;

    public QuanLyDanhSach() {
        this.danhSach=new ArrayList<SinhVienNew>();

}

    public QuanLyDanhSach(ArrayList<SinhVienNew> danhSach) {
        this.danhSach = danhSach;
    }
    public void them(SinhVienNew sv){
        this.danhSach.add(sv);
    }
    public void hienThi(){
        for (int i = 0; i <danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
        }
    }
    public boolean kiemTra(SinhVienNew sv){
        return danhSach.contains(sv);
    }
    public int timKiem(String iD){
        for(int i=0;i<danhSach.size();i++) {
            if (danhSach.get(i).getiD().equals(iD)) {
                return i;
            }
        }
        return -1;
    }

    public void sua( String iD,SinhVienNew sv){
        int indexOfsv=timKiem(iD);
        if(indexOfsv==-1) {
            System.out.println("không có sv");
        }
        else{
            danhSach.set(indexOfsv ,sv);
        }
    }
    public void xoaSv(String iD){
        int indexOfsv=timKiem(iD);
        if(indexOfsv==-1) {
            System.out.println("không có sv");
        }
        else{
            danhSach.remove(indexOfsv);
        }
    }

    public void sapXepTheoDiemTrungBinh(){
        Collections.sort(this.danhSach, new Comparator<SinhVienNew>() {
            @Override
            public int compare(SinhVienNew sv1, SinhVienNew sv2) {
                if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
                    return  -1;
                }
                else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                    return  1;
                }
                else{
                    return 0;
                }
            }
        });
    }
}
