package test;

import java.util.Scanner;

public class GreenGroceryRegister {

	/*
	Armut : 2,14 TL
	Elma : 3,67 TL
	Domates : 1,11 TL
	Muz: 0,95 TL
	Patlıcan : 5,00 TL
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, 
				bananaPrice = 0.95, eggplantPrice = 5.00, total = 0;
		int kg;
		System.out.println("Kac kg Armut istersiniz: ");
		kg = input.nextInt();
		total += (kg*pearPrice);
		System.out.println("Kac kg Elma istersiniz: ");
		kg = input.nextInt();
		total += (kg*applePrice);
		System.out.println("Kac kg Domates istersiniz: ");
		kg = input.nextInt();
		total += (kg*tomatoPrice);
		System.out.println("Kac kg Muz istersiniz: ");
		kg = input.nextInt();
		total += (kg*bananaPrice);
		System.out.println("Kac kg Patlıcan istersiniz: ");
		kg = input.nextInt();
		total += (kg*eggplantPrice);
		System.out.println("Total ucret: " + total + " TL");
		System.out.println("Iyi günler dileriz...");
		
	}

}
