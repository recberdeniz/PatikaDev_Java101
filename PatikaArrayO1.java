package test;

import java.util.Arrays;
import java.util.Scanner;

public class PatikaArrayO1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizinin boyutunu giriniz: ");
		int d = scan.nextInt();
		int list[] = new int [d];
		for(int i = 0; i < list.length; i++) {
			System.out.println("Dizinin " + (i+1) + ". elemanini giriniz: ");
			int e = scan.nextInt();
			list[i] = e;
		}
		System.out.println("Girilen duzendeki dizi: " + Arrays.toString(list));
		Arrays.sort(list);
		System.out.println("Dizinin siralanmis hali: " + Arrays.toString(list));

	}

}
