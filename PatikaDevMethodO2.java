package test;

import java.util.Scanner;

public class PatikaDevMethodO2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Asal kontrolu icin sayiyi giriniz: ");
		int number = input.nextInt();
		int result = checkPrime(number ,number-1);
		if(result == 0) {
			System.out.println(number + " sayisi asaldir.");
		} else
			System.out.println(number + " sayisi asal degildir.");

	}

	private static int checkPrime(int number, int number2) {
		if(number2 == 1) {
			return 0;
		} if(number % number2 == 0) {
			return -1;
		} 
		else
			return checkPrime(number, (number2)-1);
		
	}

}
