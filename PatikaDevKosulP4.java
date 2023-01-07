package test;

import java.util.Scanner;

public class PatikaDevKosulP4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sicaklik degerini giriniz: ");
		int degree = input.nextInt();
		if(degree < 5) {
			System.out.println("Kayaga gidebilirsiniz");
		}
		else if(degree>=5 && degree<25) {
			if(degree>=10 && degree<=15) {
				System.out.println("Sinema veya piknige gidebilirsiniz");
			}else if(degree<10) {
				System.out.println("Sinemaya gidebilirsiniz");
			}else {
				System.out.println("Piknige gidebilirsiniz");
			}
		}else {
			System.out.println("Yuzmeye gidebilirsiniz");
		}

	}

}
