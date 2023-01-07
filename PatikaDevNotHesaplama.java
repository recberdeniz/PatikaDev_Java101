package test;

import java.util.Scanner;

public class PatikaDevNotHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mat, phy, tur, chem, mus, total = 0;
		
		System.out.println("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		System.out.println("Fizik notunuzu giriniz: ");
		phy = input.nextInt();
		
		System.out.println("Turkce notunuzu giriniz: ");
		tur = input.nextInt();
		
		System.out.println("Kimya notunuzu giriniz: ");
		chem = input.nextInt();
		
		System.out.println("Muzik notunuzu giriniz: ");
		mus = input.nextInt();
		
		if(!(mat > 100 || mat < 0)) {
			total += mat;
		}
		if(!(phy > 100 || phy < 0)) {
			total += phy;
		}
		if(!(tur > 100 || tur < 0)) {
			total += tur;
		}
		if(!(chem > 100 || chem < 0)) {
			total += chem;
		}
		if(!(mus > 100 || mus < 0)) {
			total += mus;
		}
		double average = total / 5;
		if(average >= 55) {
			System.out.println("Tebrikler dersi gectiniz! \nNot ortalamaniz: " + average);
		}
		else {
			System.out.println("Derslerden kaldiniz \nNot ortalamaniz: " + average);
		}
		
	}

}
