package test;

public class PatikaDevLoopHW4 {

	public static void main(String[] args) {
		int number = 2, check = 0;
		while(number <= 100) {
			for(int i = 1; i < number; i++) {
				if((i != 1) && (number % i == 0)) {
					check++;
				}
			}
			if(check == 0) {
				System.out.print(number + " ");
			}
			number++;
			check = 0;
		}

	}

}
