package test;

import java.util.Scanner;

public class PatikaDevLoopHW3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kac satirlik yildiz ucgen olusturmak istiyorsunuz?: ");
		int row = input.nextInt();
		for(int k = row; k >=1; k--) {
			for(int j = row-k; j > 0; j--) {
				System.out.print(" ");
			}
			for(int i = (k*2)-1; i>= 1; i--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
