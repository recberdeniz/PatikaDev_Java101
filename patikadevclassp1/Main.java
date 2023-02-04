package patikadevclassp1;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Chris", "PHY", "5325320000");
		Teacher t2 = new Teacher("Rachel", "HIST", "5365360000");
		Teacher t3 = new Teacher("Michael", "LIT", "5545540000");
		
		Course phy = new Course("Physics", "101", "PHY");
		phy.addTeacher(t1);
		
		Course hist = new Course("History", "101", "HIST");
		hist.addTeacher(t2);
		
		Course lit = new Course("Literature", "101", "LIT");
		lit.addTeacher(t3);
		
		Student s1 = new Student("Dennis", "222", "3", phy, hist, lit);
		s1.addBulkExam(100, 78, 69);
		s1.addBulkPerform(80, 85, 75);
		s1.isPass();
		

	}

}
