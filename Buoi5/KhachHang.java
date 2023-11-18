package Buoi5;
import java.util.Scanner;

public class KhachHang {
	private String cccd, hten;
	private int nsinh;

	public KhachHang() {
		cccd = new String();
		hten = new String();
		nsinh = 0;
	}

	public KhachHang(KhachHang k) {
		cccd = new String(k.cccd);
		hten = new String(k.hten);
		nsinh = k.nsinh;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cccd: ");
		cccd = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		nsinh = sc.nextInt();
	}

	public void in() {
		System.out.println("Ho va ten: " + hten);
		System.out.println("So cccd: " + cccd);
		System.out.println("Nam sinh: " + nsinh);

	}

	public String toString(){
		return "Ho va ten: "+hten+ "\n" + "So cccd: " + cccd + "\n" + "Nam sinh: " + nsinh;
	}
}
