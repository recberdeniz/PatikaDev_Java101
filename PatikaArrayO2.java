package test;

import java.util.Arrays;

public class PatikaArrayO2 {

	public static void main(String[] args) {
		int dizi[] = {10, 20, 20, 10, 10, 20, 5, 20};
		findDuplicate(dizi);
		
		
	}

	private static void findDuplicate(int[] dizi) {
		int repCount = 0;
		boolean repCheck = false;
		for(int i = 0; i < dizi.length; i++) {
			for(int j = 0; j < i; j++) {
				if(dizi[i] == dizi [j]) {
					repCheck = true;
				}
			}
			if(!repCheck) {
				for(int j = 0; j < dizi.length; j++) {
					if(dizi[j] == dizi[i]) {
						repCount++;
					}
				}
				System.out.println(dizi[i] + " sayisi " + repCount + " kere tekrar etti.");
				repCount = 0;
			}
			repCheck = false;
		}
		
	}


}
