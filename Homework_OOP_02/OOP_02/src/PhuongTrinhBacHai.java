
public class PhuongTrinhBacHai {

	float a,b,c;
	float x1,x2; 
	
	public void tinhNghiem() {
		float delta = tinhDelta();
		if (delta >0) {
			this.x1 = (float)(-this.b+Math.sqrt(delta))/(2*this.a);
			this.x2 = (float)(-this.b-Math.sqrt(delta))/(2*this.a);
		}
		else if (delta == 0) {
			this.x1 = (float)(-this.b)/(2*this.a);
			this.x2 = this.x1;
		}
		else {
			System.out.print("Phuong trinh vo nghiem");
		}
	}
	
	public float tinhDelta() {
		float delta = (float) (Math.pow(this.b, 2) - (4*this.a*this.b));
		return delta;
	}
	
	public PhuongTrinhBacHai(){
		
	}
	public PhuongTrinhBacHai(float a,float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	
}
