package test;

import java.util.Scanner;

public class PatikaDevLoopP2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0, val;
		do {
			System.out.println("Sayi giriniz (Cikis icin tek sayi): ");
			val = input.nextInt();
			if(val % 2 == 0 && val % 4 == 0) {
				total += val;
			}
		}
		while(val %2 == 0);
		System.out.println("Girilen cift ve 4'un kati olan sayilarin toplami: " + total);

	}

}
