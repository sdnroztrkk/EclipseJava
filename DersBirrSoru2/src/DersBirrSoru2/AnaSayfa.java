package DersBirrSoru2;

import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float kilo;
		float boy;
		float bmi;
		
		System.out.print("Kilonuzu giriniz:");
		kilo = input.nextFloat();
		
		System.out.print("Boyunuzu giriniz:");
		boy = input.nextFloat();
		
		boy = boy * boy;
		bmi = kilo / boy;
		
		if (bmi <= 18.5)
			System.out.printf("Bmi = %f Zayıfsınız.%n", bmi);
		else if(18.5 < bmi && bmi <= 24.9)
			System.out.printf("Bmi = %f Normalsiniz.%n", bmi);
		else if(24.9 < bmi && bmi  <=29.9)
			System.out.printf("Bmi = %f Şişmansınız.%n", bmi);
		else
			System.out.printf("Bmi = %f Obezsiniz.%n", bmi);
	}
}
