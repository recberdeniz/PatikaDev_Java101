package test;

import java.util.Scanner;

public class CircleFindArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pi = 3.14, area, circum, r, alpha, angleArea;
		System.out.println("Dairenin yari cap bilgisini giriniz: ");
		r = input.nextDouble();
		area = pi*(r*r);
		circum = 2*pi*r;
		System.out.println("Cevre degeri: " + circum);
		System.out.println("Alan degeri: " + area);
		System.out.println("Alfa aci degerini giriniz: ");
		alpha = input.nextDouble();
		angleArea = (pi*(r*r)*alpha)/360;
		System.out.println(alpha + " dilimlik alan degeri: " + angleArea);

	}

}
