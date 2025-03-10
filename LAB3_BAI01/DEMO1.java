package LAB3_BAI01;
public class DEMO1 {
	public static void main(String[] args) {
		HOCSINH HS1= new HOCSINH();
		HS1.NhapHS();
		HS1.XuatHS();
		HOCSINH HS2 = new HOCSINH(111,"Nguyen Thanh Phat",8.5f);
		HS2.XuatHS();
		HOCSINH HS3 = new HOCSINH(HS2);
		HS3.XuatHS();
		HS3.setHoTen("Le Tran Tan Phat");
		HS3.XuatHS();
		float max = HS1.getDiemTB();
		String HT = HS1.getHoTen();
		if(max< HS2.getDiemTB()) {
			max= HS2.getDiemTB();
			HT = HS2.getHoTen();
		}
		if (max< HS3.getDiemTB()) {
			max=HS3.getDiemTB();
			HT=HS3.getHoTen();
		}
		System.out.println("Hoc sinh" + HT + "co diem trung binh lon nhat la:"+max);
	}
}
