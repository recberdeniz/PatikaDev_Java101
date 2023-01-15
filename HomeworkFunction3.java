package test;

import java.util.Scanner;

public class HomeworkFunction3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ussu alinacak sayiyi giriniz: ");
		int base = input.nextInt();
		System.out.println("Us degerini giriniz: ");
		int power = input.nextInt();
		int result = getPower(base, power);
		System.out.println("Sonucunuz: " + result);
		

	}
	/*
	 * (-) us ifadesi icin
	 * if(b<0){
	 * double absPower = Math.abs(b);
	 * double newP = getPower(a, absPow);
	 * return 1/newP;
	 * 
	 */
	public static int getPower(int a, int b) {
		if (b<1) {
			return 1;
		}
		else
			return a*getPower(a, b-1);
	}

}
