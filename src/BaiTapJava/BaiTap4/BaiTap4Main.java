/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava.BaiTap4;

/**
 *
 * @author DELL
 */
public class BaiTap4Main {
 
    public static void main(String[] args) {
        XeNoiThanh noiThanh1,noiThanh2,noiThanh3;
        XeNgoaiThanh ngoaiThanh1,ngoaiThanh2,ngoaiThanh3;
    
        noiThanh1 = new XeNoiThanh();
        noiThanh2 = new XeNoiThanh();
        noiThanh3 = new XeNoiThanh();

        ngoaiThanh1 = new XeNgoaiThanh();
        ngoaiThanh2 = new XeNgoaiThanh();
        ngoaiThanh3 = new XeNgoaiThanh();

        noiThanh1.maChuyen=001;
        noiThanh1.taiXe="Tran Van Duc";
        noiThanh1.soXe="034";
        noiThanh1.soTuyen="34";
        noiThanh1.soKm=60;
        noiThanh1.doanhThu=460000;
        
        noiThanh2.maChuyen=002;
        noiThanh2.taiXe="Nguyen Thanh Tung";
        noiThanh2.soXe="012";
        noiThanh2.soTuyen="23";
        noiThanh2.soKm=42;
        noiThanh2.doanhThu=300000;
        
        noiThanh3.maChuyen=003;
        noiThanh3.taiXe="Nguyen Van Nhat";
        noiThanh3.soXe="122";
        noiThanh3.soTuyen="43";
        noiThanh3.soKm=76;
        noiThanh3.doanhThu=430000;
        
        ngoaiThanh1.maChuyen=11;
        ngoaiThanh1.taiXe="Tran Duc Thang";
        ngoaiThanh1.soXe="223";
        ngoaiThanh1.noiDen="TP.HCM";
        ngoaiThanh1.soNgay=2;
        ngoaiThanh1.doanhThu=2300000;
        
        ngoaiThanh2.maChuyen=12;
        ngoaiThanh2.taiXe="Nguyen Duc Phu";
        ngoaiThanh2.soXe="243";
        ngoaiThanh2.noiDen="Hai Phong";
        ngoaiThanh2.soNgay=4;
        ngoaiThanh2.doanhThu=4500000;
        
        ngoaiThanh3.maChuyen=13;
        ngoaiThanh3.taiXe="Tran Duc Son";
        ngoaiThanh3.soXe="254";
        ngoaiThanh3.noiDen="TP.HCM";
        ngoaiThanh3.soNgay=2;
        ngoaiThanh3.doanhThu=3000000;       

        QuanLyChuyenXe DS=new QuanLyChuyenXe();
        DS.them(noiThanh1);
        DS.them(noiThanh2);
        DS.them(noiThanh3);
        DS.them(ngoaiThanh1);
        DS.them(ngoaiThanh2);
        DS.them(ngoaiThanh3);
        
        System.out.println("Thong tin tung chuyen xe:\n");
        DS.xuat();
        

        System.out.println("Tong doanh thu cua xe noi thanh:"+DS.tongDoanhThuNoiThanh());
        System.out.println("Tong doanh thu cua xe ngoai thanh:"+DS.tongDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu: "+(int)DS.tongDoanhThu());
    }
}
