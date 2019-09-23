package latihan3;

import java.util.InputMismatchException;
import java.util.Scanner;
;

public class IndeksNilaiMatkul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		try {
			System.out.println("Masukkan nilai : ");
			int nilai = sc.nextInt();
			
			if (nilai >= 0 && nilai <=20) {
				System.out.println("E");
			}else if(nilai >= 21 && nilai <=40) {
				System.out.println("D");
			}else if(nilai >= 41 && nilai <=50) {
				System.out.println("C");
			}else if(nilai >= 51 && nilai <=55) {
				System.out.println("BC");
			}else if(nilai >= 56 && nilai <=75) {
				System.out.println("B");
			}else if(nilai >= 76 && nilai <=80) {
				System.out.println("AB");
			}else if(nilai >= 81 && nilai <=100) {
				System.out.println("A");
			}
		}catch(InputMismatchException e) {
			System.out.println("nilai harus diisi");
		}
	}
	
}
