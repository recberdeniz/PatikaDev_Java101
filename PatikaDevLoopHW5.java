package test;

import java.util.Scanner;

public class PatikaDevLoopHW5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first = 0, second = 1, nValue;
		System.out.println("Fibonacci serisinin uzunlugunu giriniz: ");
		int serie = input.nextInt();
		for(int i = 0; i <= serie; i++) {
			if(i == 0 || i == 1)
				System.out.print(i + " ");
			else {
				nValue = first + second;
				first = second;
				second = nValue;
				System.out.print(nValue + " ");
			}
		}

	}

}
