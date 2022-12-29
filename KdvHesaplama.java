package test;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("KDV'siz fiyati giriniz: ");
		double withoutTax = input.nextDouble();
		double tax = 0.18;
		double withTax = withoutTax + (withoutTax * tax);
		double taxAmount = withoutTax * tax;
		System.out.println("KDV'siz fiyat: " + withoutTax);
		System.out.println("KDV orani: " + tax);
		System.out.println("KDV tutari: " + taxAmount);
		System.out.println("KDV'li fiyat: " + withTax);
		

	}

}
