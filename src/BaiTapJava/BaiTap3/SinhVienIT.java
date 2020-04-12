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
public class SinhVienIT extends SinhVienPoly{
    public double diemJava;
    public double diemHtml;
    public double diemCss;

    public SinhVienIT(String hoTen, String nganh,double diemJava,double diemHtml,double diemCss) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        return (2*diemJava+diemHtml+diemCss)/4;
    }
    
}
