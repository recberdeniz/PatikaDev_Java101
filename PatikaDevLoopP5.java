package test;

import java.util.Scanner;

public class PatikaDevLoopP5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 1;
		System.out.println("Kuvveti alinacak sayiyi giriniz: ");
		int number = input.nextInt();
		System.out.println("Kuvvet degerini giriniz: ");
		int power = input.nextInt();
		if(power == 0) {
			System.out.println("Sonuc: " + result);
		} else {
			for(int i = 1; i <= power; i++) {
				result *= number;
			}
			System.out.println("Sonuc: " + result);
		}

	}

}
