package test;

import java.util.Scanner;

public class PatikaDevLoopP7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double result = 0;
		System.out.println("Harmonik hesaplanacak sayiyi giriniz: ");
		int number = input.nextInt();
		for(int i = 1; i <= number; i++) {
			result += 1.0/i;
		}
		System.out.println("Sonuc: " + result);


	}

}
