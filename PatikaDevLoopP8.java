package test;

public class PatikaDevLoopP8 {

	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 6-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1;k <= (i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k = 5; k >=1; k--) {
			for(int j = 6-k; j > 0; j--) {
				System.out.print(" ");
			}
			for(int i = (k*2)-1; i>= 1; i--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
