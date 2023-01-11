package test;

import java.util.Scanner;

public class PatikaDevLoopP6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		System.out.println("Basamak sayilarinin toplamini istediginiz sayiyi giriniz: ");
		int number = input.nextInt();
		while(number != 0) {
			result += number % 10;
			number /= 10;
		}
		System.out.println("Result: " + result);

	}

}
