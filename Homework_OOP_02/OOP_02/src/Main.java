

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Bài tập 01: •	Viết chương trình khai báo một lớp Phương trình bậc 2 
		 * 					với các thuộc tính là a, b, c với các phương thức sau:
						•	Hàm tạo không tham số.
						•	Hàm tạo có 3 tham số.
						•	Get/set cho 3 thuộc tính.
						•	Phương thức tính delta.
						•	Phương thức tính nghiệm phương trình.
		 */

		/* Bài tập 03: Viết chương trình OOP quản lý sinh viên đơn giản: Nhập, xuất thông tin, tính điểm TB.
		 * 
		 * 
		 * */
		
//		SinhVien sv1 = new SinhVien(1111,"Dao Cong Phu",7.5f,8.0f);
//		System.out.print(sv1.toString());
//		
//		SinhVien sv2 = new SinhVien();
//		sv2.maSoSinhVien = 2222;
//		sv2.hoTen = "Nguyen Van A";
//		sv2.diemLT = 8.1f;
//		sv2.diemTH = 5.6f;
//		System.out.print(sv2.toString());
//		
//		SinhVien sv3 = new SinhVien();
//		nhapThongTinSinhVien(sv3);
//		System.out.print(sv3.toString());
		
		/* Bài tập 04: Ngân hàng ABC muốn lưu trữ thông tin của mỗi tài khoản như sau: Mỗi tài khoản chứa các thông tin
		 * 				 Số tài khoản ( Kiểu long), 
						 Tên tài khoản (kiểu chuỗi), 
						 Số tiền trong tài khoản (kiểu double) (a). 
		 * 
		 * */
		Account  ac01 = new Account();
		ac01.soTK =9999;
		ac01.tenTK="Nguyen Van A";
		ac01.soTienConLai = 500000;
		System.out.print(ac01.toString());
		
		
		
	}
// Start Function
	public static void nhapThongTinSinhVien(SinhVien sv) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma so sinh vien: ");
		sv.setMaSoSinhVien(sc.nextInt());
		System.out.print("Nhap vao ho va ten: ");
		sv.setHoTen(sc.next());
		System.out.print("Diem ly thuyet: ");
		sv.setDiemLT(sc.nextFloat());
		System.out.print("Diem thuc hanh: ");
		sv.setDiemTH(sc.nextFloat());
	}
}
