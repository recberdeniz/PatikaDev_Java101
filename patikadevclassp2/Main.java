package patikadevclassp2;

public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("name1", 30, 100, 90, 50);
		Fighter f2 = new Fighter("name2", 20, 110, 100, 50);
		
		Match match = new Match(f1, f2, 90, 100);
		
		match.run();

	}

}
