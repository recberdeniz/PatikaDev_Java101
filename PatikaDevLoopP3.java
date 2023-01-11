package test;

import java.util.Scanner;

public class PatikaDevLoopP3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi degerini giriniz: ");
		int count = 0;
		int val = input.nextInt();
		for(int i = 1,j = 1; i<val && j<val; i*=4 ,j*=5) {
			System.out.println("4 un " + count + ". kuvveti: " + i);
			System.out.println("5 un " + count + ". kuvveti: " + j);
			count++;
		}

	}

}
