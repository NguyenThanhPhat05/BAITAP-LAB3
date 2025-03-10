package LAB3_BAI01;
import java.util.Scanner;
public class DSHOCSINH {
	private HOCSINH DS[];
	private int SoLuong;
	
	public DSHOCSINH (int SoLuong) {
		this.SoLuong=SoLuong;
		DS= new HOCSINH[SoLuong];
	}
	public void NhapDS() {
		Scanner kb = new Scanner(System.in);
		for (int i=0 ; i<SoLuong;i++) {
			System.out.println("Nhap thong tin hoc sinh thu"+(i+1)+":");
			DS[i] = new HOCSINH();
			DS[i].NhapHS(); 
		}
	}
	public void XuatDS() {
		System.out.println("Danh sach hoc sinh la: \n");
		for(int i=0; i<SoLuong;i++) {
			DS[i].XuatHS();
		}
	}
	public void SapXep() {
		for (int i=0; i<SoLuong-1;i++) {
			for (int j=i+1; j<SoLuong;j++) {
				if (DS[i].getDiemTB()< DS[j].getDiemTB()) {
					HOCSINH temp=DS[i];
					DS[i]=DS[j];
					DS[j]=temp;
				}
			}
		}
	}

}
