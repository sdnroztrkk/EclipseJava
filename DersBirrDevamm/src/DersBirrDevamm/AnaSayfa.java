package DersBirrDevamm;

import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int toplam;
		int fark;
		int carpim;
		float bolme;
		
		System.out.print("Enter first integer:");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer:");
		number2= input.nextInt();
		
		toplam = number1 + number2;
		System.out.printf("%d + %d = %d%n", number1, number2, toplam);
		
		fark = number1 - number2;
		System.out.printf("%d - %d = %d%n", number1, number2, fark);
		
		carpim = number1 * number2;
		System.out.printf("%d * %d = %d%n", number1, number2, carpim);
		
		bolme = number1 / number2;
		System.out.printf("%d / %d = %f%n", number1, number2, bolme);
		
	}

}
