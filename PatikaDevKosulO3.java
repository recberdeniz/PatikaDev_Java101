package test;

import java.util.Scanner;

public class PatikaDevKosulO3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Yıl bilgisini giriniz: ");
		int year = input.nextInt();
		if(year % 4 == 0) {
			if(year%100 == 0){
				if(year % 400 == 0) {
					System.out.println("Girilen yil artiktir.");
				}
				else {
					System.out.println("Girilen yil artik degildir.");
				}
			}
		}
		else
			System.out.println("Girilen yil artik degildir.");
		

	}

}
