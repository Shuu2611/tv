package TruongTHPT;

import java.util.Scanner;

public class Nguoi {
	private String hten, noiSinh, diaChi;
	private int gioiTinh;
	private int namSinh;
	public Nguoi() {
		hten = new String();
		noiSinh = new String();
		diaChi = new String();
		gioiTinh = 0;
		namSinh = 0;
	}
	public Nguoi(Nguoi n) {
		hten = new String(n.hten);
		noiSinh = new String(n.noiSinh);
		diaChi = new String(n.diaChi);
		gioiTinh = n.gioiTinh;
		namSinh = n.namSinh;
	}
	public Nguoi(String h,String n, String d, int gt, int ns) {
		this.hten = new String(h);
		this.noiSinh = new String(n);
		this.diaChi = new String(d);
		this.gioiTinh = gt;
		this.namSinh = ns;
	}
	public int layGioiTinh() {
		return gioiTinh;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		hten=sc.nextLine();
		
		System.out.println("Nhập nơi sinh: ");
		noiSinh=sc.nextLine();
		System.out.println("Nhập năm sinh: ");
		namSinh=sc.nextInt();
		System.out.println("Nhập địa chỉ: ");
		diaChi=sc.nextLine();
		System.out.println("Nhập giới tính nam (0) nữ (1): ");
		gioiTinh = sc.nextInt();
	}
	public void in() {
		System.out.println("Họ tên: "+hten);
		if(layGioiTinh()==1)
			System.out.println("Giới tính: Nữ");
		else
			System.out.println("Giới tính: Nam");
		System.out.println("Nơi sinh: "+noiSinh);
		System.out.println("Địa chỉ: "+diaChi);
		System.out.println("Năm sinh: "+namSinh);
	}
	public String toString() {
		String S = "Họ tên: "+hten;
		if(layGioiTinh()==1)
			S +="Giới tính: Nữ";
		else
			S +="Giới tính: Nam";
		S +="Nơi sinh: "+noiSinh;
		S +="Địa chỉ: "+diaChi;
		S +="Năm sinh: "+namSinh;
		return S;
	}
	public int layHSKvaG() {
		return 0;
	}
}
