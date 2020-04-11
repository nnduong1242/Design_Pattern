/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava.BaiTap2;

import BaiTapJava.BaiTap2.BaiTap2.NhanVien;
import java.util.ArrayList;



/**
 *
 * @author DELL
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> DS = new ArrayList<>();

    @Override
    public void them(BaiTap2.NhanVien nv) {
        DS.add(nv);
    }

    @Override
    public void inDS() {
        for (int i=0;i<DS.size();i++)
            System.out.println(DS.get(i).getThongTin());
    }
}
