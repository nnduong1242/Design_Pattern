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
public class XeNoiThanh extends ChuyenXe{
    public String soTuyen;
    public double soKm;

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
    
    @Override
    public void inThongTinChuyenXe() {
        System.out.println("Ma chuyen xe: "+maChuyen+"\nTen tai xe: "+taiXe+"\nSo xe: "+soXe
                +"\nSo tuyen: "+soTuyen+"\nSo Km: "+soKm+"\nDoanh thu: "+doanhThu);
    };
    
}
