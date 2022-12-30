package test;

import java.util.Scanner;

public class HipotenusHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iki kenar uzunlugunu giriniz: ");
		int edgeF = input.nextInt();
		int edgeS = input.nextInt();
		int result = ((edgeF*edgeF) + (edgeS*edgeS));
		System.out.println(result);
		double hypo = Math.sqrt(result);
		System.out.println("Hipotenus degeri: " + hypo);
		
		System.out.println("Ucgen icin uc kenar uzunlugu giriniz: ");
		int eF = input.nextInt();
		int eS = input.nextInt();
		int eT = input.nextInt();
		
		double circum = (eF + eS + eT);
		double u = circum/2;
		double area_2 = u * (u - eF) * (u - eS) * (u - eT);
		
		System.out.println("Cevre uzunlugu: " + circum);
		System.out.println("Alan: " + Math.sqrt(area_2));

	}

}
