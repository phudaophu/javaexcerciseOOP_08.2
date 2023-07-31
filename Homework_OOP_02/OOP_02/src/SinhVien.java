
import java.util.Scanner;

public class SinhVien {
	int maSoSinhVien; 
	String hoTen; 
	float diemLT; 
	float diemTH;
	float diemTB;
	//public Object toString;
	public SinhVien() {
		this.hoTen="";
		diemLT = 0;
		diemTH = 0;
	}
	public SinhVien(int maSoSinhVien, String hoTen, float diemLT, float diemTH) {
		this.maSoSinhVien = maSoSinhVien;
		this.hoTen = hoTen;
		this.diemLT = diemLT; 
		this.diemTH = diemTH;
	}
//	public SinhVien() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhap vao ma so sinh vien: ");
//		this.maSoSinhVien = sc.nextInt();
//		System.out.print("Nhap vao ho va ten: ");
//		this.hoTen = sc.next();
//		System.out.print("Diem ly thuyet: ");
//		this.diemLT = sc.nextFloat();
//		System.out.print("Diem thuc hanh: ");
//		this.diemTH = sc.nextFloat();
//	}
	//---------------- METHOD--------------//

	public void diemTrungBinh() {
		this.diemTB = (this.diemLT+this.diemTH)/2;
	}
	public String toString() {
		header();
		return this.maSoSinhVien+"\t\t| "+this.hoTen+"\t\t| "+this.diemLT+ "\t\t\t|" +this.diemTH+"\t\t\t|"+ this.diemTB +"\n";
	}
	public void header() {
		System.out.println("Ma So SV \t| Ho Ten \t\t| Diem Ly Thuyet \t| Diem Thuc Hanh \t| Diem TB");
	}
	//------------ SETTER GETTER --------------//
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public int getMaSoSinhVien() {
		return maSoSinhVien;
	}
	public void setMaSoSinhVien(int maSoSinhVien) {
		this.maSoSinhVien = maSoSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
}
