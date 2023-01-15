package test;

import java.util.Scanner;

public class PatikaDevMethodP1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Sayi giriniz: ");
		num = input.nextInt();
		System.out.println(isPalindrom(num));

	}

	private static boolean isPalindrom(int num) {
		int temp = num; int palNum = 0, lastNumber;
		while(temp != 0) {
			lastNumber = temp % 10;
			palNum = (palNum * 10) + lastNumber;
			temp /= 10;
		}
		if(palNum == num)
			return true;
		else
			return false;
	}

}
