package Buoi5;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;
	private Date d;
	private KhachHang k;

	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		k = new KhachHang();
		d = new Date();
	}

	public HoaDon(HoaDon h) {
		mso = new String(h.mso);
		tde = new String(h.tde);
		nvien = new String(h.nvien);
		k = new KhachHang(h.k);
		d = new Date(h.d);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		mso = sc.nextLine();
		System.out.println("Nhap tieu de: ");
		tde = sc.nextLine();
		System.out.println("Nhap nhan vien: ");
		nvien = sc.nextLine();
		System.out.println("Nhap vao KhachHang (0) hay KhachHangVIP (1): ");
		int c = sc.nextInt();
		if (c == 0)
			k = new KhachHang();
		else
			k = new KhachHangVIP();
		k.nhap();
		System.out.println("Nhap vao ngay lap hoa don");
		d.nhap();
	}

	public void in() {
		System.out.println("Ma so: " + mso);
		System.out.println("Tieu de: " + tde);
		System.out.println("Nhan vien: " + nvien);
	}

	public String toString() {
		return "Ma so: " + mso + "Tieu de: " + tde + "Nhan vien: " + nvien;
	}

	public static void main(String[] args) {
		HoaDon h1 = new HoaDon();
		h1.nhap();
		h1.in();
		HoaDon h2 = new HoaDon(h1);
		h2.in();
		
		HoaDon ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so hoa don: ");
		int n = sc.nextInt();
		ds = new HoaDon[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap hoa don thu " + (i + 1) + ":");
			ds[i].nhap();
		}
		for (int i = 0; i < n; i++) {
			ds[i].in();
		}
	}
}
