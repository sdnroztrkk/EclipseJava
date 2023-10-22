package DersBirSoruBirA;

import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		int birler;
		int onlar;
		int yuzler;
		int binler;
		int onbinler;
		
		System.out.print("5 basamaklı bir sayı giriniz:");
		number = input.nextInt();
		
		birler = number % 10;
		number = number / 10;
		
		onlar = number % 10;
		number = number / 10;
		
		yuzler = number % 10;
		number = number/10;
		
		binler = number % 10;
		number = number / 10;
		
		onbinler = number % 10;
		number = number / 10;
		
		System.out.printf("Birler: %d%n", birler);
		System.out.printf("Onlar: %d%n", onlar);
		System.out.printf("Yüzler: %d%n", yuzler);
		System.out.printf("Binler: %d%n", binler);
		System.out.printf("Onbinler: %d%n", onbinler);
	}

}
