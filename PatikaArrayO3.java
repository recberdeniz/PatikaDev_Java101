package test;

import java.util.Arrays;

public class PatikaArrayO3 {

	public static void main(String[] args) {
		int dizi[][] = {{1,2,3},{4,5,6}};
		int col = 0;
		for(int[] i: dizi) {
			for(int j: i) {
				col++;
			}
		}
		col /= dizi.length;
		int transpoze[][] = new int[col][dizi.length];
		for(int i = 0; i < dizi.length; i++) {
			for(int j = 0; j < dizi[i].length; j++) {
				transpoze[j][i] = dizi[i][j];
			}
		}
		for(int[] i: transpoze) {
			for(int j: i)
				System.out.print(j + " ");
			System.out.println();
		}
		

	}

}
