package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PatikaRandomSayiO {

	static int right = 5, rightCheck = 5, index = 0;
	static int numbers[] = new int[right];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int randNum = rand.nextInt(101);
		play(scan, randNum);

	}
	private static void play(Scanner scan, int randNum) {
		while(true) {
			if(right <= 0) {
				System.out.println("Haklariniz bitti!");
				break;
			}
			System.out.println("(0-100 arasi) Sayi tahmininizi giriniz: ");
			int guess = scan.nextInt();
			numbers[index] = guess;
			index++;
			if(guess < 0 || guess > 100) {
				System.out.println("Lutfen 0 ile 100 arasi sayi giriniz!");
				right--;
				System.out.println("Kalan hakkiniz: " + right);
			} else {
				if(guess == randNum) {
					System.out.println("Tebrikler sayiyi bildiniz!");
					break;
				} else {
					System.out.println("Hatali sayi girdiniz...");
					right--;
					System.out.println("Kalan hakkiniz: " + right);
					if(guess > randNum)
						System.out.println(guess + " sayisi gizli sayidan buyuktur.");
					else
						System.out.println(guess + " sayisi gizli sayidan kucuktur.");
				}
			}
		}
		System.out.println("Girilen sayilar: " + Arrays.toString(numbers));
		System.out.println("Gizli sayi: " + randNum);
		
	}

}
