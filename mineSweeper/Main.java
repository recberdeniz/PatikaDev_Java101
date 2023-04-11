package mineSweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mayin tarlasi oyununa hosgeldiniz!");
		System.out.println("Lutfen mayin tarlasi boyutlarini giriniz");
		System.out.println("Satir sayisi:");
		int row = scan.nextInt();
		System.out.println("Sutun sayisi:");
		int col = scan.nextInt();
		
		MineSweeper mine = new MineSweeper(row, col);
		mine.run();
		
		

	}

}
