package test;

import java.util.Scanner;

public class PatikaDevMethodP3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                	mod();
                	break;
                case 8:
                	squareDiameter();
                	break;
                case 0:
                    break;
                default:
                	System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

	}

	private static void squareDiameter() {
		Scanner input = new Scanner(System.in);
		System.out.println("Alan ve cevre hesabı yapilacak kenar degerlerini giriniz: ");
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		int square = k1*k2;
		int diameter = (2*k1) + (2*k2);
		System.out.println("Alan: " + square + "Cevre: " + diameter);
		
	}

	private static void mod() {
		Scanner input = new Scanner(System.in);
		System.out.println("Modu alınacak sayiyi giriniz: ");
		int number = input.nextInt();
		System.out.println("Mod degerini giriniz: ");
		int val = input.nextInt();
		System.out.println(number + " % " + val + " = " + number%val);
		
	}

	private static void factorial() {
		Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
		
	}

	private static void power() {
		Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
		
	}

	private static void divided() {
		Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
		
	}

	private static void times() {
		Scanner input = new Scanner(System.in);
		int i = 1, number, result = 1;
		while(true) {
			System.out.println("Islemden cikmak icin '1' giriniz.");
			System.out.println(i + ". sayiyi giriniz:");
			number = input.nextInt();
			if(number == 0) {
				result = 0;
				break;
			}
			if(number == 1) {
				break;
			}
			result *= number;
		}
		System.out.println("Sonuc: " + result);
		
	}

	private static void minus() {
		Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
		
	}

	private static void plus() {
		Scanner input = new Scanner(System.in);
		int i = 1, number, result = 0;
		while(true) {
			System.out.println("Islemden cikmak icin '0' giriniz.");
			System.out.println(i + ". sayiyi giriniz:");
			number = input.nextInt();
			if(number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Sonuc: " + result);
		
	}

}
