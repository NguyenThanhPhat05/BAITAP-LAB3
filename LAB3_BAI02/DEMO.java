package LAB3_BAI02;
import java.util.Scanner;
public class DEMO {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		PHANSO P1 = new PHANSO();
		System.out.print("Phan so P1 mac dinh:");
		P1.XuatPS();
		P1.NhapPS();
		System.out.print("Phan so P1 sau khi nhap:");
		P1.XuatPS();
		
		PHANSO P2 = new PHANSO(4,16);
		System.out.print("Phan so P2:");
		P2.XuatPS();
		System.out.print("Nhap phan so P3:");
		PHANSO P3 = new PHANSO();
		P3.NhapPS();
		System.out.print("Phan so P3:");
		P3.XuatPS();
		
		PHANSO PSKQ = P1.Cong(P3);
		System.out.print("Ket qua P1 + P3 la:");
		PSKQ.XuatPS();
		PHANSO P4=new PHANSO(PSKQ);
		System.out.print("Phan so P4:");
		P4.XuatPS();
		PHANSO PSNHAN = P4.Nhan(P2);
		System.out.print("Ket qua P4*P2 la:");
		PSNHAN.XuatPS();
		
	}

}
