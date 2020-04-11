/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava.BaiTap1;

/**
 *
 * @author DELL
 */
public class BaiTap1 {
    static class NhanVien{


      private String Ten;
      private int Tuoi;
      private String DiaChi;
      private double TienLuong;
      private int TongSoGioLam;

        private NhanVien() {
        }


      public String getThongTin(){
          System.out.println("Ten: "+Ten+"\nTuoi: "+Tuoi+"\nDia Chi: "+DiaChi+"\nTien Luong: "+TienLuong+"\nTong So Gio Lam: "+TongSoGioLam+"\nTien Thuong: "+tinhThuong()+"\n");
          return null;
      }

      public double tinhThuong(){

          //+ Nếu tổng số giờ làm của nhân viên >=200 thì thưởng = lương * 20%.
          //+ Nếu tổng số giờ làm của nhân viên <200 và >=100 thì thưởng = lương * 10%.
          //+ Nếu tổng số giờ làm của nhân viên <100 thì thưởng =0.

          if (TongSoGioLam >= 200) return TienLuong*0.2;
          else if (TongSoGioLam <200 && TongSoGioLam >=100) return TienLuong*0.1;
          else return 0;

         }

          public String getTen() {
               return Ten;
          }

          public void setTen(String Ten) {
                this.Ten = Ten;
          }

           public int getTuoi() {
               return Tuoi;
           }

           public void setTuoi(int Tuoi) {
               this.Tuoi = Tuoi;
           }

           public String getDiaChi() {
               return DiaChi;
           }

           public void setDiaChi(String DiaChi) {
               this.DiaChi = DiaChi;
          }

          public double getTienLuong() {
              return TienLuong;
          }

           public void setTienLuong(double TienLuong) {
               this.TienLuong = TienLuong;
          }

          public int getTongSoGioLam() {
              return TongSoGioLam;
          }

          public void setTongSoGioLam(int TongSoGioLam) {
               this.TongSoGioLam = TongSoGioLam;
           }

        public NhanVien(String Ten, int Tuoi, String DiaChi, double TienLuong, int TongSoGioLam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.TongSoGioLam = TongSoGioLam;
       }
    public static void main(String[] args) {
        NhanVien NV1,NV2;
        NV1= new NhanVien();
        NV2= new NhanVien();
        
        NV1.setTen("Nguyen Nam Duong");
        NV1.setTuoi(20);
        NV1.setDiaChi("Cam Ranh");
        NV1.setTienLuong(5000000);
        NV1.setTongSoGioLam(240);
        
        NV2.setTen("Diep Tuy Dung");
        NV2.setTuoi(20);
        NV2.setDiaChi("Nha Trang");
        NV2.setTienLuong(5500000);
        NV2.setTongSoGioLam(300);
        
        NV1.getThongTin();
        NV2.getThongTin();
    }
   }
}
