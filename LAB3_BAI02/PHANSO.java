package LAB3_BAI02;
import java.util.Scanner;
class PHANSO {
	private int Tu;
	private int Mau;
	
	public PHANSO() {
		this.Tu=0;
		this.Mau=1;
	}
	public PHANSO(int Tu,int Mau) {
		if(Mau==0) {
			System.out.print("Mau so khong the bang 0!!");
		}
		this.Tu=Tu;
		this.Mau=Mau;
	}
	public PHANSO(PHANSO PS) {
		this.Tu=PS.Tu;
		this.Mau=PS.Mau;
	}
	public void NhapPS() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap tu so:");
		Tu=kb.nextInt();
		do {
			System.out.print("Nhap mau so (khac 0):");
			Mau=kb.nextInt();
		}while (Mau==0);
	}
	public void XuatPS() {
		if (Mau==1) {
			System.out.println(Tu);
		}else {
			System.out.println(Tu + "/" + Mau);
		}
	}
	private int USCLN(int a, int b) {
		a= Math.abs(a);
		b= Math.abs(b);
		while(b!=0){
			b=a%b;
			a=temp;
		}
		return a;
	}
	public void RutGon() {
		int uscln = USCLN(Tu,Mau);
		this.Tu /=uscln;
		this.Mau /=uscln;
		
		if(Mau<0) {
			Tu*=-1;
			Mau*=-1;
		}
	}
	public PHANSO Cong(PHANSO PS) {
		int TuMoi=Tu*PS.Mau+PS.Tu*Mau;
		int MauMoi=Mau*PS.Mau;
		return new PHANSO(TuMoi,MauMoi);
	}
	public PHANSO Tru(PHANSO PS) {
		int TuMoi=Tu*PS.Mau-PS.Tu*Mau;
		int MauMoi=Mau*PS.Mau;
		return new PHANSO(TuMoi,MauMoi);
	}
	public PHANSO Nhan(PHANSO PS) {
		return new PHANSO(Tu*PS.Tu,Mau*PS.Mau);
	}
	public PHANSO Chia(PHANSO PS) {
		return new PHANSO(Tu*PS.Mau,Mau*PS.Tu);
	}

}
