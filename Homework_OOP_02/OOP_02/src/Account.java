
import java.text.DecimalFormat;


public class Account {
	long soTK;
	String tenTK;
	double soTienConLai;
	final float INTEREST=0.035f;
	// ----------------------//
	// ---- CONSTRUCTOR -----// 
	// ----------------------//
	public Account() {
		
	}
	public Account(long soTK,String tenTK, double soTienConLai) {
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienConLai = soTienConLai;
	}
	public Account(long soTK,String tenTK) {
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienConLai = 50;
	}
	// ------- METHOD -------//
	public String toString () {
//		Locale locale = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
//		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		DecimalFormat formatter = new DecimalFormat("#,###");
		return "So TK: "+this.soTK +" | Ten TK: "+this.tenTK + " | So tien con lai: " + (formatter.format(this.soTienConLai))+"VND";
		//return "So TK: "+this.soTK +" | Ten TK: "+this.tenTK + " | So tien con lai: " + currencyFormatter.format(this.soTienConLai);
	}
	public void moneyAdding(double soTienThemVao) {
		if(soTienThemVao >=0) {
			this.soTienConLai += soTienThemVao;
			System.out.println("Successfull!!! So tien nap vao la: "+soTienThemVao);
			System.out.println("So tien con lai: "+this.soTienConLai);
		}
		else {
			System.out.println("Warning!!! So tien them vao phai la so duong");
		}
	}
	
	public void moneyWithdraw(double soTienRut, double phiRut) {
		if(soTienRut >=0) {
			this.soTienConLai -= (soTienRut + phiRut);
			System.out.println("Successfull!!! So tien rut ra la: "+soTienRut+ "phi rut tien: " +phiRut);
			System.out.println("So tien con lai: "+this.soTienConLai);
		}
		else {
			System.out.print("Warning!!! So tien rut ra phai la so duong");
		}
	}
	public void maturityPeriod(float laiSuat) {
		if(laiSuat >=0) {
			this.soTienConLai += (double)(this.soTienConLai*laiSuat);
			System.out.println("Successfull!!! Dao han thanh cong, lai suat la: "+laiSuat);
			System.out.println("So tien con lai: "+this.soTienConLai);
		}
		else {
			System.out.print("Warning!!! Lai suat la so duong");
		}
	}
	public void moneyTransfering(Account taiKhoanDen, double soTienChuyen) {
		int flag = 0;
		if(taiKhoanDen.soTK != this.soTK && soTienChuyen > 0) {
			moneyWithdraw(soTienChuyen,0);
			flag = 1;
			taiKhoanDen.moneyAdding(soTienChuyen);
			flag = 2; 
			if (flag ==2 )
			System.out.println("Successfull!!! Chuyen tien thanh cong");
		}
		else {
			System.out.print("Failure!!! Tai khoan dich phai khac tai khoan nguon, hoac so tien chuyen phai la so duong");
		}
	}
	
	// ----- GETTER SETTER -----//
	public long getSoTK() {
		return soTK;
	}
	public void setSoTK(long soTK) {
		this.soTK = soTK;
	}
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	public double getSoTienConLai() {
		return soTienConLai;
	}
	public void setSoTienConLai(double soTienConLai) {
		this.soTienConLai = soTienConLai;
	}
	
	
	
	
}
