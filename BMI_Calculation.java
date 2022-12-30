package test;

import java.util.Scanner;

public class BMI_Calculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kilo bilginizi giriniz: ");
		double weight = input.nextDouble();
		System.out.println("Boy bilginizi metre olarak giriniz: ");
		double height = input.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("Beden Kitle Indeksiniz: " + bmi);

	}

}
