package TruongTHPT;

import java.util.Scanner;

public class SDTHPT {
	public static void main(String[] args) {
		Nguoi ds1[];
		Nguoi ds2[];

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào danh sách số Học Sinh: ");
		int n=sc.nextInt();
		ds1=new HocSinh[n];
		for(int i =0;i<n;i++) {
			ds1[i]=new HocSinh();
			ds1[i].nhap();
			if(ds1[i].layHSKvaG()==1) {
				ds1[i].in();
			}
		}
		
		System.out.println("Nhập vào danh sách số Giáo Viên: ");
		int m=sc.nextInt();
		ds2=new Nguoi[m];
		for(int i =0;i<=m;i++) {
			ds2[i]=new GiaoVien();
			ds2[i].nhap();
		}
	}
}
