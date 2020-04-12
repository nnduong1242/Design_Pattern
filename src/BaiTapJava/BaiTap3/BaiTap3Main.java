/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava.BaiTap3;

/**
 *
 * @author DELL
 */
public class BaiTap3Main {
    public static void main(String[] args) {
        SinhVienPoly sv1 = new SinhVienIT("Nguyen Nam Duong", "Cong nghe thong tin",8,7,7);
        SinhVienIT sv2 = new SinhVienIT("Tran Duc Thang", "Cong nghe thong tin",7,5,7);
        SinhVienBiz sv3 = new SinhVienBiz("Tran Dang Khoa","Quan tri kinh doanh",4,6);

        sv1.Xuat();
        System.out.println("Diem TB: "+sv1.getDiem()+"\nHoc luc: "+sv1.getHocLuc()+"\n");
        sv2.Xuat();
        System.out.println("Diem TB: "+sv2.getDiem()+"\nHoc luc: "+sv2.getHocLuc()+"\n");
        sv3.Xuat();
        System.out.println("Diem TB: "+sv3.getDiem()+"\nHoc luc: "+sv3.getHocLuc()+"\n");
    }
        
}
