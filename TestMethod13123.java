package test;

import java.util.Scanner;

public class TestMethod13123 {

	public static void main(String[] args) {
		String message = "N degerini giriniz: ";
		int n = dataRead(message);
		int k = n;
		int j = n;
		recursiveFunc(n, k, j);
		int a = n;
		int b = a;
		a = 25;
		System.out.println(a + " " + b);

	}

	private static void recursiveFunc(int n, int k, int j) {
		if(n <= 0) {
			if(k <= j) {
				System.out.print(k + " ");
				recursiveFunc(n, k+5, j);
			}
		}
		else{
			System.out.print(n + " ");
			recursiveFunc(n-5 ,k-5, j);
		}
		
	}

	private static int dataRead(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		int n = input.nextInt();
		return n;
	}

}
