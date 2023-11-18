package Buoi5;

import java.util.Scanner;


public class KhachHangVIP extends KhachHang {
	private float tleGiam;
	private Date d;
	public KhachHangVIP(){
		super();
		tleGiam = 0;
		d = new Date();
	}
	public KhachHangVIP(KhachHangVIP k){
		super((KhachHang) k);
		tleGiam = k.tleGiam;
		d = new Date(k.d);
	}
	public void nhap(){
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ti le giam: ");
		tleGiam=sc.nextFloat();
		System.out.println("Nhap ngay tro thanh VIP: ");
		d.nhap();
	}
	public void in(){
		super.in();
		System.out.println("ti le giam: "+ tleGiam);
		System.out.println("ngay tro thanh VIP: "+d);
	}
	public String toString(){
		super.toString();
		return "ti le giam: "+ tleGiam + "ngay tro thanh VIP: "+d;
	}
	public float laytleGiam(){
		return tleGiam;
	}
}
