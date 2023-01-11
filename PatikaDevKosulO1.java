package test;

import java.util.Scanner;

public class PatikaDevKosulO1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int range, age, pType;
		double nTotal, dTotal;
		System.out.println("Mesafeyi giriniz: ");
		range = input.nextInt();
		System.out.println("Yas bilgisi giriniz: ");
		age = input.nextInt();
		System.out.println("Yolculuk tipini giriniz(1-2): ");
		pType = input.nextInt();
		if(range <= 0 || age < 0 || (pType != 1 && pType != 2)) {
			System.out.println("Hatali veri girdiniz!");
		}
		else {
			nTotal = range * 0.10;
			if(age<12) {
				nTotal -= nTotal*0.5;
				if(pType == 2) {
					dTotal = nTotal - (nTotal*0.2);
					dTotal *= 2;
					System.out.println("Toplam tutar: " + dTotal + " TL");
				}
				else
					System.out.println("Toplam tutar: " + nTotal + " TL");
			}
			else if(age>=12 && age<=24) {
				nTotal -= nTotal*0.1;
				if(pType == 2) {
					dTotal = nTotal - (nTotal*0.2);
					dTotal *= 2;
					System.out.println("Toplam tutar: " + dTotal + " TL");
				}
				else
					System.out.println("Toplam tutar: " + nTotal + " TL");
			}
			else if(age <= 65) {
				nTotal -= nTotal*0.3;
				if(pType == 2) {
					dTotal = nTotal - (nTotal*0.2);
					dTotal *= 2;
					System.out.println("Toplam tutar: " + dTotal + " TL");
				}
				else
					System.out.println("Toplam tutar: " + nTotal + " TL");
			}
			else {
				if(pType == 2) {
					dTotal = nTotal - (nTotal*0.2);
					dTotal *= 2;
					System.out.println("Toplam tutar: " + dTotal + " TL");
				}
				else
					System.out.println("Toplam tutar: " + nTotal + " TL");
			}
		}

	}

}
