package DersBirSoru3;

import java.util.Scanner;

public class AnaSayfa {

		public static void main(String[] args) {
		double PI_SAYISI = 3.14259;
		Scanner input = new Scanner(System.in);
		
		double yaricap;
		double cevre;
		double alan;
		
		
		System.out.print("Yarı çapı giriniz:");
		yaricap = input.nextDouble();
		
		cevre = 2 * PI_SAYISI * yaricap;
		alan = PI_SAYISI * (yaricap * yaricap);
		
		System.out.printf("Dairenin çevresi = %f%n", cevre);
		System.out.printf("Dairenin alanı = %f%n", alan);

	}

}
