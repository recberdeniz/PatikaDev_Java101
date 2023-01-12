package test;

import java.util.Scanner;

public class PatikaDevLoopHW1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0, min = 0, count = 0;
		System.out.println("Kac adet sayi gireceksiniz?: ");
		int thresh = input.nextInt();
		while(count < thresh) {
			System.out.println("Sayiyi giriniz: ");
			int val = input.nextInt();
			if(val <= min)
				min = val;
			if(val >= max)
				max = val;
			count++;
		}
		System.out.println("Girilen en kucuk sayi: " + min);
		System.out.println("Girilen en buyuk sayi: " + max);

	}

}
