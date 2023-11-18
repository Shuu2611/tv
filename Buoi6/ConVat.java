package Buoi6;

import java.util.Scanner;

public abstract class ConVat {
	private String giong, mau;
	private float cnang;
	private static int count=0;
	public abstract void keu();
	public ConVat() {
		giong = new String();
		mau = new String();
		cnang = 0.0f;
		count++;
	}
	public ConVat(String g, String m,float c) {
		giong = new String(g);
		mau = new String(m);
		cnang = 0.0f;
		count++;
	}
	public ConVat(ConVat a) {
		giong = new String(a.giong);
		mau = new String(a.mau);
		cnang = a.cnang;
		count++;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong con vat: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau con vat: ");
		mau = sc.nextLine();
		System.out.println("Nhap can nang con vat: ");
		cnang = sc.nextFloat();
		
	}
	public void in() {
		System.out.println("Giong: "+giong);
		System.out.println("Mau: "+mau);
		System.out.println("Can nang: "+cnang);
	}
	public String toString() {
		return "Giong: "+giong+"\nMau: "+mau+"\nCan Nang: "+cnang;
	}
	public static int layCount() {
		return count;
	}
}
