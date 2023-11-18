package TruongTHPT;

import java.util.Scanner;

public class HocSinh extends Nguoi{
	private float van, toan, english;
	public HocSinh() {
		super();
		van = 0.0f;
		toan = 0.0f;
		english = 0.0f;
	}
	public HocSinh(HocSinh h) {
		super(h);
		van = h.van;
		toan = h.toan;
		english = h.english;
	}
	/*public HocSinh(float v, float t, float e) {
		van = v;
		toan = t;
		english = e;
	}*/
	public void nhap() {
		super.nhap();;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm Văn: ");
		van = sc.nextFloat();
		System.out.println("Nhập điểm Toán: ");
		toan = sc.nextFloat();
		System.out.println("Nhập điểm Anh Văn: ");
		english = sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println("Văn: "+van);
		System.out.println("Toán: "+toan);
		System.out.println("Anh Văn: "+english);
		float dtb = (van+toan+english)/3;
		if(dtb>=8&&van>=6.5&&toan>=6.5&&english>=6.5) {
			System.out.println("Học sinh Giỏi");
		}
		else if(dtb>=6.5&&dtb<8&&van>=5&&toan>=5&&english>=5) {
			System.out.println("Học sinh Khá");
		}
		else if(dtb>=5&&dtb<6.5&&van>=3&&toan>=3&&english>=3) {
			System.out.println("Học sinh Trung Bình");
		}
		else {
			System.out.println("Học sinh Yếu");
		}
	}
	public int layHSKvaG() {
		int f=0;
		float dtb = (van+toan+english)/3;
		if(dtb>=6.5&&van>=5&&toan>=5&&english>=5) {
			f=1;
		}
		return f;
	}
}

