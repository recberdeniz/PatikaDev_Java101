package mineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	private int row;
	private int col;
	
	private String [][] map;
	private String [][] board;
	
	private int size;
	
	public MineSweeper(int row, int col) {
		this.row = row;
		this.col = col;
		this.map = new String[row][col];
		this.board = new String[row][col];
		this.size = row * col;
	}
	
	public void run() {
		createTemplate(board);
		createTemplate(map);
		mineDistribution();
		System.out.println("--------");
		while(true) {
			showMap(board);
			if(isWin()) {
				System.out.println("Oyunu kazandiniz!");
				showMap(map);
				break;
			}
			System.out.println("Satir giriniz: ");
			int userRow = scan.nextInt();
			System.out.println("Sutun giriniz: ");
			int userCol = scan.nextInt();
			if(!map[userRow][userCol].equals("*")) {
				 int count = checkMineLocation(userRow, userCol);
				 String numberOfMine = mineCounter(count);
				 board[userRow][userCol] = numberOfMine;
			} else {
				System.out.println("Game Over!");
				showMap(map);
				break;
			}
		}
	}
	

	private boolean isWin() {
		int count = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j].equals("-"))
					count++;
			}
		}
		if(count == (row*col/4)) {
			return true;
		}
		
		return false;
		
	}

	private String mineCounter(int count) {
		if(count == 0)
			return "0";
		else if(count == 1)
			return "1";
		else if(count == 2)
			return "2";
		else if(count == 3)
			return "3";
		else if(count == 4)
			return "4";
		else if(count == 5)
			return "5";
		else if(count == 6)
			return "6";
		else if(count == 7)
			return "7";
		else
			return null;
	}

	private int checkMineLocation(int userRow, int userCol) {
		int count = 0;
		if((userRow > 0 && userRow < row-1) && (userCol > 0 && userCol < col-1)) {
			for(int i = userRow-1; i <= userRow+1; i++) {
				for(int j = userCol-1; j <= userCol+1; j++) {
					if(map[i][j].equals("*"))
						count++;
				}
			}
		} else {
			if(userRow == 0 && (userCol > 0 && userCol < col-1)) {
				for(int i = userRow; i <= userRow+1; i++) {
					for(int j = userCol-1; j <= userCol+1; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			} else if(userRow == row-1 && (userCol > 0 && userCol < col-1)) {
				for(int i = userRow-1; i <= userRow; i++) {
					for(int j = userCol-1; j <= userCol+1; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			} else if(userRow == 0 && userCol == 0) {
				for(int i = userRow; i <= userRow+1; i++) {
					for(int j = userCol; j <= userCol+1; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			} else if(userRow == row-1 && userCol == col-1) {
				for(int i = userRow-1; i <= userRow; i++) {
					for(int j = userCol-1; j <= userCol; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			} else if(userCol == 0 && (userRow > 0 && userRow < row-1)) {
				for(int i = userRow-1; i <= userRow+1; i++) {
					for(int j = userCol; j <= userCol+1; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			} else if(userCol == col-1 && (userRow > 0 && userRow < row-1)) {
				for(int i = userRow-1; i <= userRow+1; i++) {
					for(int j = userCol-1; j <= userCol; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			} else if(userCol == col-1 && userRow == 0) {
				for(int i = userRow; i <= userRow+1; i++) {
					for(int j = userCol-1; j <= userCol; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			} else if(userCol == 0 && userRow == row-1) {
				for(int i = userRow-1; i <= userRow; i++) {
					for(int j = userCol; j <= userCol+1; j++) {
						if(map[i][j].equals("*"))
							count++;
					}
				}
			}
		}
		
		return count;
		
	}

	public void mineDistribution() {
		int randRow, randCol, count = 0;
		
		while(count != (size/4)){
			randRow = rand.nextInt(row);
			randCol = rand.nextInt(col);
			
			if(!map[randRow][randCol].equals("*")) {
				map[randRow][randCol] = "*";
				count++;
			}
		}
	}
	public void showMap(String arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void createTemplate(String arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "-";
			}
		}
	}
}
