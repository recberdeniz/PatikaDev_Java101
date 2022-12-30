package test;

import java.util.Scanner;

public class TaksiMetreHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double kmPer = 2.20, total;
		int min = 20, openTaxi = 10;
		System.out.println("Kac km yol gideceksiniz?: ");
		double km = input.nextDouble();
		total = openTaxi + (km*kmPer);
		String control = total < min ? "Total ucret: " + min + " TL"
				: "Total ucret: " + total + " TL";
		System.out.println(control);
		
	}

}
