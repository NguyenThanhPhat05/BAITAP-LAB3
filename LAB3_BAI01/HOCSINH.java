package LAB3_BAI01;
import java.util.Scanner;
public class HOCSINH {
	private int MaSo;
	private String HoTen;
	private float DiemTB;
	
	public HOCSINH() {
		this.MaSo=0;
		this.HoTen="";
		this.DiemTB=0.0f;
	}
	public HOCSINH(int MaSo,String HoTen,float DiemTB) {
		this.MaSo=MaSo;
		this.HoTen=HoTen;
		this.DiemTB=DiemTB;
	}
	public HOCSINH(HOCSINH HS) {
		this.MaSo=HS.MaSo;
		this.HoTen=HS.HoTen;
		this.DiemTB=HS.DiemTB;
	}
	public int getMaSo() {
		return MaSo;
	}
	public String getHoTen() {
		return HoTen;
	}
	public float getDiemTB() {
		return DiemTB;
	}
	public void setMaSo(int MaSo) {
		this.MaSo=MaSo;
	}
	public void setHoTen(String HoTen) {
		this.HoTen=HoTen;
	}
	public void setDiemTB(float DiemTB) {
		this.DiemTB=DiemTB;
	}
	public void NhapHS() {
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap ma so:");
		MaSo = kb.nextInt();
		System.out.print("Nhap ho ten hoc sinh:");
		HoTen = kb.nextLine();
		System.out.print("Nhap diem trung binh:");
		DiemTB = kb.nextFloat();
	}
	public void XuatHS() {
		System.out.println("Ma so:"+MaSo);
		System.out.println("Ho Ten:"+HoTen);
		System.out.println("Diem Trung Binh:"+DiemTB);
	}
	public void XepHang() {
		if(DiemTB<5) {
			System.out.println("Xep loai yeu!!");
		}else if (DiemTB>5 && DiemTB<7) {
			System.out.println("Xep loai trung binh!!");
		}else if (DiemTB>=7 &&  DiemTB<8.5) {
			System.out.println("Xep loai kha!!");
		}else {
			System.out.println("Xep loai gioi<3");
		}
	}
}
