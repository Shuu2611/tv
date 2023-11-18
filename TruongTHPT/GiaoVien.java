package TruongTHPT;

import java.util.Scanner;

public class GiaoVien extends Nguoi {
	private int namGiangDay;
	private String chuyenMon;
	
	public GiaoVien() {
		namGiangDay = 0;
		chuyenMon = new String();
	}
	public GiaoVien(GiaoVien g) {
		namGiangDay = g.namGiangDay;
		chuyenMon = new String(g.chuyenMon);
	}
	public GiaoVien(int n,String c) {
		namGiangDay = n;
		chuyenMon = new String(c);
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập năm giảng dạy: ");
		namGiangDay = sc.nextInt();
		System.out.println("Nhập chuyên môn: ");
		chuyenMon = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("Năm giảng dạy: "+namGiangDay);
		System.out.println("Chuyên môn: "+chuyenMon);
	}
	public String toString() {
		super.toString();
		return "Năm giảng dạy: "+namGiangDay+"\nChuyên môn: "+chuyenMon;
	}
}
