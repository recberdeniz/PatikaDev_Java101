package test;

import java.util.Scanner;

public class HomeworkFunction2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kelimeyi giriniz: ");
		String str = input.nextLine();
		String result = inverse(str);
		System.out.println(result);
		
	}
	public static String inverse(String word) {
		int length = (word.length()-1);
		int count = 0, check = 0;
		while(check < length) {
			Character cOne = word.charAt(check);
			Character cTwo = word.charAt(length);
			if(cOne != cTwo) {
				count++;
			}
			check++;
			length--;
		}
		if(count == 0)
			return "Evet";
		else
			return "Hayir";
	}

}
