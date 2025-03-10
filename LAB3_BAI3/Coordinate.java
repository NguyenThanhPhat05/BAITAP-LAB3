package LAB3_BAI3;
import java.util.Scanner;
public class Coordinate {
	static class Point2D{
	 private float x;
	 private float y;
	 
	 public Point2D() {
		 this.x=0.0f;
		 this.y=0.0f;
	 }
	 public Point2D(float x,float y) {
		 this.x=x;
		 this.y=y;
	 }
	 public float getX() {
		 return x;
	 }
	 public float getY() {
		 return y;
	 }
	 
	 public Point2D Cong(Point2D P) {
		 return new Point2D(x+P.x,y+P.y);
	 }
	 public Point2D DoiXung() {
		 return new Point2D(x,-y);
	 }
	 public void NhapTD() {
		 Scanner kb= new Scanner(System.in);
		 System.out.print("Vui long nhap x:");
		 x= kb.nextFloat();
		 System.out.print("Vui long nhap y:");
		 y= kb.nextFloat();
	 }
	 public void XuatTD() {
		 System.out.println("Toa do x va y la:" + x + " " + y);
	 }
}
	public static void main (String[]args) {
		Point2D P1 = new Point2D();
		System.out.println("Nhap toa do P1:");
		P1.NhapTD();
		System.out.println("Diem P1:");
		P1.XuatTD();
		Point2D P2 = new Point2D();
		System.out.println("Nhap toa do P2:");
		P2.NhapTD();
		System.out.println("Diem 2:");
		P2.XuatTD();
		Point2D Tong=P1.Cong(P2);
		System.out.println("Tong P1+P2 la:");
		Tong.XuatTD();
		Point2D DiemDX = P2.DoiXung();
		System.out.println("Sau khi doi xung la:");
		DiemDX.XuatTD();
		}
	}
