package latihan1;

import java.util.Scanner;

public class PersegiPanjang {
	public static void main (System[] args) {
		Scanner sc = new Scanner(System.in);
			int Panjang = sc.nextInt();
			int Lebar = sc.nextInt();
			int Luas = Panjang * Lebar;
			int Keliling = (2*(Panjang+Lebar));
			
			System.out.println("Panjang = "+Panjang);
			System.out.println("Lebar = "+Lebar);
			System.out.println("Luas = "+Luas);
			System.out.println("Keliling = "+Keliling);
	}
}
