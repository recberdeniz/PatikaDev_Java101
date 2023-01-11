package test;

import java.util.Scanner;

public class PatikaDevLoopP4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int facN = 1, facR = 1, facRN = 1;
		System.out.println("Kombinasyon icin gereken n degerini giriniz: ");
		int n = input.nextInt();
		System.out.println("Kombinasyon icin gereken r degerini giriniz: ");
		int r = input.nextInt();
		if(n == 0 || r == 0) {
			facN = 1;
			facR = 1;
		} else {
			for(int i = 1; i <= n; i++) {
				facN *= i;
			}
			for(int j = 1; j <= r; j++) {
				facR *= j;
			}
		}
		int difRN = n - r;
		if (difRN == 0) {
			facRN = 1;
		} else {
			for(int i = 1; i <= difRN; i++) {
				facRN *= i;
			}
		}
		int comb = facN / (facR * facRN);
		System.out.println("Kombinasyon: " + comb);

	}

}
