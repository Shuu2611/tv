package Buoi6;

import java.util.Scanner;

public class SDConVat {

	public static void main(String[] args) {
		/*ConVat cv;
		cv = new Bo();
		cv.nhap();
		cv.in();
		cv.keu();
		cv = new Heo();
		cv.nhap();
		cv.in();
		cv.keu();
		*/
		//Nhập vào một danh sách con vật Bò hoặc Heo
		ConVat ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số con vật: ");
		int n = sc.nextInt();
		ds = new ConVat[n];
		for(int i =0;i<n;i++) {
			System.out.println("Nhập vào lựa chọn Bò (0) hoặc Heo (1) ");
			int c = sc.nextInt();
			if(c==0) ds[i] = new Bo();
			else if(c==2) ds[i] = new Ga();
			else 
				ds[i] = new Heo();
			
			ds[i].nhap(); //ConVat.nhap()
		}
		for(int i = 0;i<n;i++) {
			System.out.println((i+1) +"-"+ds[i]);
			ds[i].keu();
		}
		System.out.println("Số con vật: "+ds[0].layCount());
		//System.out.println("Số con vật: "+ConVat.layCount());
	}

}
