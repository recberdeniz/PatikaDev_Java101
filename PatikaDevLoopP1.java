package test;

import java.util.Scanner;

public class PatikaDevLoopP1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi degerini giriniz: ");
		int val = input.nextInt();
		for(int i = 1; i<=val; i++) {
			if(i % 3 == 0 && i %4 == 0) {
				System.out.println(i + " sayisi 3'e ve 4'e bolunebilir.");
			}
		}

	}

}
