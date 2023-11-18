package Buoi5;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	
	
	public Date() { 
		ngay = 15;
		thang = 9;
		nam = 2023;
	}
	public Date(int ngay1,int thang1, int nam1) {
		ngay = ngay1;
		thang = thang1;
		nam = nam1;
	}
	public Date(Date d){
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Nhap ngay: ");
		ngay=sc.nextInt();
		System.out.println("Nhap thang: ");
		thang=sc.nextInt();
		System.out.println("nhap nam: ");
		nam=sc.nextInt();
		if(!hople()) System.out.println("Nhap sai! Vui long nhap lai!");
		}while(!hople());
		}
	public boolean hople() {
			  // 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12
		int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam%4==0)&&(nam%100!=0)||(nam%400==0)) max[2] = 29;
		boolean h = false;
		if(ngay>0 && thang>0 && nam>=0 && thang<13 && ngay<=max[thang]) {
			h = true;
		}
		return h;
	}
	public void in() {
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public Date ngayhomsau() {
		Date c = new Date(ngay,thang,nam);
		c.ngay++;
		if(!c.hople()) {
			c.ngay=1;
			c.thang++;
			if(!c.hople()) {
				c.thang=1;
				c.nam++;
			}
		}
		return c;
	}
	public Date cong(int n) {
		Date c = new Date(ngay,thang,nam);
		for(int i = 0; i<n;i++) {
			c=c.ngayhomsau();
		}
		return c;
	}
}
