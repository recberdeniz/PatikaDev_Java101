package test;

import java.util.Scanner;

public class PatikaDevLoopP9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username, password;
		int balance = 1500, select, right = 3;
		while(right>0) {
			System.out.println("Kullanici adinizi giriniz: ");
			username = input.nextLine();
			System.out.println("Sifrenizi giriniz: ");
			password = input.nextLine();
			if(username.equals("deniz") && password.equals("12345")) {
				System.out.println("Hosgeldin " + username);
				while(true) {
					System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
					System.out.println("Yapmak istediginiz islemi giriniz: ");
					select = input.nextInt();
					switch(select) {
					case 1:
						System.out.println("Yatirmak istediginiz tutari giriniz: ");
						int addBalance = input.nextInt();
						balance += addBalance;
						continue;						
					case 2:
						System.out.println("Cekmek istediginiz tutari giriniz: ");
						int price = input.nextInt();
						if(price > balance) {
							System.out.println("Yeterli bakiyeniz bulunmamaktadir...");
							continue;
						} else {
							balance -= price;
							System.out.println("Guncel bakiyeniz: " + balance + " TL");
						}
						continue;
					case 3:
						System.out.println("Bakiye sorgulaniyor...");
						System.out.println("Guncel bakiyeniz: " + balance + " TL");
						continue;
					case 4:
						System.out.println("Sistemden cikiliyor...");
						System.out.println("Gorusmek uzere " + username);
						break;
					}
				}
			} else {
				right --;
				System.out.println("Kullanici bilgileri yanlis, lutfen tekrar deneyiniz...");
				if(right == 0) {
					System.out.println("Hesabiniz bloke olmustur...");
				} else {
					System.out.println("Kalan hakkiniz: " + right);
				}
			}
		}

	}

}
