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
public class XeNgoaiThanh extends ChuyenXe{
    public String noiDen;
    public int soNgay;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    
    @Override
    public void inThongTinChuyenXe() {
        System.out.println("Ma chuyen xe: "+maChuyen+"\nTen tai xe: "+taiXe+"\nSo xe: "+soXe
                +"\nNoi den: "+noiDen+"\nSo ngay di:"+soNgay+"\nDoanh thu: "+doanhThu);
    };
}
