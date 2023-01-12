package test;

import java.util.Scanner;

public class PatikaDevLoopHW2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, check = 0;
		System.out.println("Mukemmel sayi kontrolu icin pozitif sayi giriniz: ");
		number = input.nextInt();
		if(number <= 0) {
			System.out.println("Lutfen pozitif sayi giriniz...");
		} else {
			for(int i = 1; i < number; i++) {
				if(number % i == 0) {
					check += i;
				}
			}
			if(number == check) {
				System.out.println(number + " sayisi mukemmeldir.");
			}
			else
				System.out.println(number + " sayisi mukemmel degildir.");
		}

	}

}
