package test;

import java.util.Scanner;

public class PatikaDevKosulO2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dogum yilinizi giriniz: ");
		int year = input.nextInt();
		int modVal = year % 12;
		String zodiac;
		switch(modVal) {
		case 0:
			zodiac = "Maymun";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 1:
			zodiac = "Horoz";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 2:
			zodiac = "Kopek";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 3:
			zodiac = "Domuz";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 4:
			zodiac = "Fare";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 5:
			zodiac = "Okuz";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 6:
			zodiac = "Kaplan";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 7:
			zodiac = "Tavsan";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 8:
			zodiac = "Ejderha";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 9:
			zodiac = "Yilan";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 10:
			zodiac = "At";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		case 11:
			zodiac = "Koyun";
			System.out.println("Cin zodyak burcunuz: " + zodiac);
			break;
		default:
			System.out.println("Hatali veri girdiniz!");
		}
		

	}

}
