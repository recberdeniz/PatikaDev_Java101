package test;

import java.util.Scanner;

public class PatikaDevLoopP10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("EBOB/EKOK hesabi yapilacak ilk sayiyi giriniz: ");
		int nrOne = input.nextInt();
		System.out.println("EBOB/EKOK hesabi yapilacak ikinci sayiyi giriniz: ");
		int nrTwo = input.nextInt();
		int count = 1;
		int ebob = 0;
		if(nrOne > nrTwo) {
			while(count <= nrOne) {
				if((nrOne % count == 0) && (nrTwo % count == 0)) {
					ebob = count;
				}
				count++;
			}
		}
		else {
			while(count <= nrTwo) {
				if((nrTwo % count == 0) && (nrOne % count == 0)){
					ebob = count;
				}
				count++;
			}
		}
		int ekok = (nrOne * nrTwo) / ebob;
		System.out.println("EBOB: " + ebob);
		System.out.println("EKOK: " + ekok);

	}

}
