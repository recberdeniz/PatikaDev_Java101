package test;

public class PatikaArrayP1 {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
		double harmonik = 0;
		for(int i:numbers) {
			harmonik += 1.0/i;
		}
		double harmonikOrt = numbers.length/harmonik;
		System.out.println("Harmonik ortalama: " + harmonikOrt);

	}

}
