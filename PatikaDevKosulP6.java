package test;

import java.util.Scanner;

public class PatikaDevKosulP6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dogum ayinizi giriniz: ");
		int m = input.nextInt();
		System.out.println("Dogum gununuzu giriniz: ");
		int d = input.nextInt();
		if(m == 1) {
			if(d >= 1 && d <= 31) {
				if(d >= 20)
					System.out.println("Burcunuz Kova");
				else
					System.out.println("Burcunuz Oglak");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 2) {
			if(d >= 1 && d <= 28) {
				if(d >= 19)
					System.out.println("Burcunuz Balik");
				else
					System.out.println("Burcunuz Kova");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 3) {
			if(d >= 1 && d <= 31) {
				if(d >= 21)
					System.out.println("Burcunuz Koc");
				else
					System.out.println("Burcunuz Balik");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 4) {
			if(d >= 1 && d <= 30) {
				if(d >= 21)
					System.out.println("Burcunuz Boga");
				else
					System.out.println("Burcunuz Koc");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 5) {
			if(d >= 1 && d <= 31) {
				if(d >= 21)
					System.out.println("Burcunuz Ikizler");
				else
					System.out.println("Burcunuz Boga");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 6) {
			if(d >= 1 && d <= 30) {
				if(d >= 21)
					System.out.println("Burcunuz Yengec");
				else
					System.out.println("Burcunuz Ikizler");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 7) {
			if(d >= 1 && d <= 31) {
				if(d >= 23)
					System.out.println("Burcunuz Aslan");
				else
					System.out.println("Burcunuz Yengec");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 8) {
			if(d >= 1 && d <= 31) {
				if(d >= 23)
					System.out.println("Burcunuz Basak");
				else
					System.out.println("Burcunuz Aslan");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 9) {
			if(d >= 1 && d <= 30) {
				if(d >= 23)
					System.out.println("Burcunuz Terazi");
				else
					System.out.println("Burcunuz Basak");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 10) {
			if(d >= 1 && d <= 31) {
				if(d >= 23)
					System.out.println("Burcunuz Akrep");
				else
					System.out.println("Burcunuz Terazi");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 11) {
			if(d >= 1 && d <= 30) {
				if(d >= 23)
					System.out.println("Burcunuz Yay");
				else
					System.out.println("Burcunuz Akrep");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else if(m == 12) {
			if(d >= 1 && d <= 31) {
				if(d >= 22)
					System.out.println("Burcunuz Oglak");
				else
					System.out.println("Burcunuz Yay");
			}
			else
				System.out.println("Tarihi kontrol ediniz!");
		}
		else {
			System.out.println("Hatali ay bilgisi!");
		}

	}

}
