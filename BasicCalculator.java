package test;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double result;
		System.out.println("Hesap makinesi programina hoşgeldiniz!");
		System.out.println("Ilk sayiyi giriniz: ");
		int numberOne = input.nextInt();
		System.out.println("Ikinci sayiyi giriniz: ");
		int numberTwo = input.nextInt();
		System.out.println("Islem seciniz (1- Toplama, 2- Cikarma, 3- Carpma, 4- Bolme): ");
		int process = input.nextInt();
		switch(process) {
			case 1:
				result = numberOne + numberTwo;
				System.out.println("Islem sonucu: " + result);
				break;			
			case 2:
				result = numberOne - numberTwo;
				System.out.println("Islem sonucu: " + result);
				break;
			case 3:
				result = numberOne * numberTwo;
				System.out.println("Islem sonucu: " + result);
				break;
			case 4:
				if(numberTwo == 0) {
					System.out.println("Bir sayi 0'a bolunemez!");
					break;
				}
				else {
					result = numberOne / numberTwo;
					System.out.println("Islem sonucu: " + result);
					break;
				}
			default:
				System.out.println("Gecersiz islem girildi!");
		}
		

	}

}
