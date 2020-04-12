/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava.BaiTap4;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class QuanLyChuyenXe {

    ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    public ArrayList<ChuyenXe> getDsChuyenXe() {
        return dsChuyenXe;
    }

    public void setDsChuyenXe(ArrayList<ChuyenXe> dsChuyenXe) {
        this.dsChuyenXe = dsChuyenXe;
    }

    public void them(ChuyenXe cx){
        dsChuyenXe.add(cx);
    }
    public void xuat(){
        for(int i=0;i<dsChuyenXe.size();i++){
            dsChuyenXe.get(i).inThongTinChuyenXe();
            System.out.println();
        }
    }
    
    //tinh tong doanh thu xe noi thanh
    public double tongDoanhThuNoiThanh() {
        double tongNoiThanh = 0;
        for(int i=0;i<dsChuyenXe.size();i++){
            
            XeNoiThanh nt = dsChuyenXe.get(i) instanceof XeNoiThanh ? ((XeNoiThanh) dsChuyenXe.get(i)) : null;
            if(nt !=null) tongNoiThanh+= nt.doanhThu;
      }
      return tongNoiThanh;
    }

    // tinh tong doanh thu xe ngoai thanh
    public double tongDoanhThuNgoaiThanh() {
        double tongNgoaiThanh = 0;
        for(int i=0;i<dsChuyenXe.size();i++){
            XeNgoaiThanh nt = dsChuyenXe.get(i) instanceof XeNgoaiThanh ? ((XeNgoaiThanh) dsChuyenXe.get(i)) : null;
            if(nt !=null) tongNgoaiThanh+= nt.doanhThu;
            }
           
        return tongNgoaiThanh;
    }

    // tinh tong doanh thu
    public double tongDoanhThu() {
        double tong = 0;
        for(int i=0;i<dsChuyenXe.size();i++){
            tong = tong + dsChuyenXe.get(i).doanhThu;
        }
        return tong;

    }
}
