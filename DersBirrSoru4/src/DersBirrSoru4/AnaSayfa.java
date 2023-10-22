package DersBirrSoru4;

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
		
		System.out.printf("%d %d %d %d %d", birler, onlar, yuzler, binler, onbinler);
	
	}
}
