package test;

import java.util.Scanner;

public class PatikaArrayP2 {

	public static void main(String[] args) {
		int dizi[] = {15,12,788,1,-1,-778,2,0};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		int number = scan.nextInt();
		int enb = dizi[0];
		int enk = dizi[0];
		for(int i: dizi) {
			if(i > enb) {
				enb = i;
			} if(i < enk) {
				enk = i;
			}
		}
		for(int i: dizi) {
			if(i - number > 0 && (i-number < enb - number)) {
				enb = i;
			} if(number - i > 0 && (number-i < number - enk)) {
				enk = i;
			}
		}
		System.out.println("En yakin buyuk: " + enb + "\nEn yakin kucuk: " + enk);

	}

}
