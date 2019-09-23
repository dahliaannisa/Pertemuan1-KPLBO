package latihan2;

import java.util.Scanner;

public class PersegiPanjang {
	Scanner sc = new Scanner(System.in);
	

	
	
	int Panjang = sc.nextInt();
	int Lebar = sc.nextInt();
	
	
	public double hitungLuas() {
		double Luas = Panjang * Lebar;
		
		return Luas;
	}
	
	public double hitungKeliling() {
		double Keliling = 2*(Panjang+Lebar);
		
		return Keliling;
	}
	
	public void tampil() {
		System.out.println("Panjang" + Panjang);
		System.out.println("Lebar = "+Lebar);
		
	}
	
	public static void main(String[] args) {
		PersegiPanjang pp = new PersegiPanjang();
		pp.hitungLuas();
		pp.hitungKeliling();
		pp.tampil();
	}
}
