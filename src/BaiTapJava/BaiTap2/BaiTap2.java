/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava.BaiTap2;

/**
 *
 * @author DELL
 */
public class BaiTap2 {
    static class NhanVien{


      private String Ten;
      private int Tuoi;
      private String DiaChi;
      private double TienLuong;
      private int TongSoGioLam;

       


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
        
        System.out.println("Bai tap 1:");
        NV1.getThongTin();
        System.out.println();
        NV2.getThongTin();
        
        QuanLyNhanVien DS= new QuanLyNhanVien();
        
        //Khởi tạo thêm 5 nhân viên
        NhanVien NV3,NV4,NV5,NV6,NV7;
        NV3= new NhanVien();
        NV4= new NhanVien();
        NV5= new NhanVien();
        NV6= new NhanVien();
        NV7= new NhanVien();
        
        NV3.setTen("Nguyen Xuan Thoi");
        NV3.setTuoi(19);
        NV3.setDiaChi("Cam Lam");
        NV3.setTienLuong(4000000);
        NV3.setTongSoGioLam(150);
        
        NV4.setTen("Nguyen Van Tien");
        NV4.setTuoi(32);
        NV4.setDiaChi("Nha Trang");
        NV4.setTienLuong(3000000);
        NV4.setTongSoGioLam(180);
        
        NV5.setTen("Nguyen Huu Nhat");
        NV5.setTuoi(28);
        NV5.setDiaChi("Nha Trang");
        NV5.setTienLuong(3000000);
        NV5.setTongSoGioLam(160);
        
        NV6.setTen("Nguyen Thi Thu Hien");
        NV6.setTuoi(30);
        NV6.setDiaChi("Cam Loc");
        NV6.setTienLuong(2500000);
        NV6.setTongSoGioLam(200);
        
        NV7.setTen("Pham Duc Khanh");
        NV7.setTuoi(25);
        NV7.setDiaChi("Nha Trang");
        NV7.setTienLuong(5500000);
        NV7.setTongSoGioLam(250);
        
        
        //Thêm vào danh sách
        DS.them(NV3);
        DS.them(NV4);
        DS.them(NV5);
        DS.them(NV6);
        DS.them(NV7);
        
        System.out.println("\nBaiTap2:");
        DS.inDS();
    }
   }
}
