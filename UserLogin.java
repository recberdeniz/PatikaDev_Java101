package test;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName, password, nPass, eUser = "userTest", ePass = "userPassword"; 
		int islem;
		System.out.println("Kullanici adinizi giriniz: ");
		userName = input.nextLine();
		System.out.println("Sifrenizi giriniz: ");
		password = input.nextLine();
		if(userName.equals(eUser)) {
			if(password.equals(ePass)) {
				System.out.println("Hosgeldin " + eUser + "!");
			}
			else if(!password.equals(ePass)) {
				System.out.println("Sifrenizi yanlis girdiniz, yeni sifre talebi icin 1'e basin: ");
				islem = input.nextInt();
				if(islem == 1) {
					System.out.println("Yeni sifre belirleme islemi... ");
					nPass = input.nextLine();
					System.out.println("Sifreyi tekrar giriniz: ");
					nPass = input.nextLine();
					if(password.equals(nPass)) {
						System.out.println("Sifreniz hatali girdiginiz sifre ile ayni olamaz!");
					}
					else if(nPass.equals(ePass)) {
						System.out.println("Sifreniz eski sifrenizle ayni olamaz!");
					}
					else
						System.out.println("Sifreniz basarili bir sekilde degistirildi!");
				}
				else {
					System.out.println("Gecersiz islem...");
				}
			}
		}
		else {
			System.out.println("Kullanici adini yanlis girdiniz, tekrar deneyiniz...");
		}

	}

}
