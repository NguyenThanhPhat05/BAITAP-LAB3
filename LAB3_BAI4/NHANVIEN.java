package LAB3_BAI4;
import java.util.Scanner;
public class NHANVIEN {
	private String MaSo;
    private String HoTen;
    private double LuongCoBan;
    private double HeSoLuong;
    private double SoLuong;
    public NHANVIEN() {
    	this.MaSo = "";
        this.HoTen = "";
        this.LuongCoBan = 0;
        this.HeSoLuong = 0;
        this.SoLuong = 0;
    }
    public NHANVIEN(String MaSo, String HoTen, double LuongCoBan, double HeSoLuong) {
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.LuongCoBan = LuongCoBan;
        this.HeSoLuong = HeSoLuong;
        this.SoLuong = TinhLuong();
}
    public String getMaSo() {
    	return MaSo; 
    }
    public void setMaSo(String MaSo) {
    	this.MaSo = MaSo; 
    }
    public String getHoTen() { 
    	return HoTen; 
    }
    public void setHoTen(String HoTen) {
    	this.HoTen = HoTen;
    }

    public double getHeSoLuong() {
    	return HeSoLuong;
    }
    public void setHeSoLuong(double HeSoLuong) {
    	this.HeSoLuong = HeSoLuong;
    }
    public TinhLuong() {
    	return LuongCoBan*HeSoLuong;
    }
    public void nhapThongTin(Scanner kb) {
        System.out.print("Nhap ma nhan vien: ");
        MaSo = kb.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        HoTen = kb.nextLine();
        System.out.print("Nhap luong co ban: ");
        LuongCoBan = kb.nextDouble();
        System.out.print("Nhap he so luong: ");
        HeSoLuong = kb.nextDouble();
        kb.nextLine(); 
        this.SoLuong = TinhLuong();
    }
    public void xuatThongTin() {
        System.out.println("Ma so: " + MaSo + ", Ho ten: " + HoTen +
                ", Luong co ban: " + LuongCoBan + ", He so luong: " + HeSoLuong +
                ", So luong: " + SoLuong);
    }
}  
