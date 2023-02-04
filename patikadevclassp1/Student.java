package patikadevclassp1;

public class Student {
	public Course c1;
	public Course c2;
	public Course c3;
	public String name;
	public String stNo;
	public String grade;
	public double averageC1;
	public double averageC2;
	public double averageC3;
	public boolean isPass;
	
	public Student(String name, String stNo, String grade, Course c1, Course c2, Course c3) {
		this.name = name;
		this.stNo = stNo;
		this.grade = grade;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.averageC1 = 0.0;
		this.averageC2 = 0.0;
		this.averageC3 = 0.0;
		this.isPass = false;
	}
	
	public void addBulkExam(int note1, int note2, int note3) {
		if(note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}
		if(note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if(note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}
		
	}
	
	public void addBulkPerform(int pNote1, int pNote2, int pNote3) {
		if(pNote1 >= 0 && pNote1 <= 100) {
			this.c1.pNote = pNote1;
		}
		if(pNote2 >= 0 && pNote2 <= 100) {
			this.c2.pNote = pNote2;
		}
		if(pNote3 >= 0 && pNote3 <= 100) {
			this.c3.pNote = pNote3;
		}
	}
	
	public void isPass() {
		System.out.println("==============================");
		printNote();
		System.out.println("==============================");
		printPerformans();
		System.out.println("==============================");
		this.averageC1 = (this.c1.note * 0.8) + (this.c1.pNote * 0.2);
		System.out.println("Not ortalamaniz: " + this.averageC1);
		if(this.averageC1 > 55 && this.averageC1 <= 100) {
			this.isPass = true;
			System.out.println(c1.name + " Dersini gectiniz!");
		} else {
			this.isPass = false;
			System.out.println(c1.name + "Dersinden kaldiniz...");
		}
		this.averageC2 = (this.c2.note * 0.8) + (this.c2.pNote * 0.2);
		System.out.println("Not ortalamaniz: " + this.averageC2);
		if(this.averageC2 > 55 && this.averageC2 <= 100) {
			this.isPass = true;
			System.out.println(c2.name + " Dersini gectiniz!");
		} else {
			this.isPass = false;
			System.out.println(c2.name + "Dersinden kaldiniz...");
		}
		this.averageC3 = (this.c3.note * 0.8) + (this.c3.pNote * 0.2);
		System.out.println("Not ortalamaniz: " + this.averageC3);
		if(this.averageC3 > 55 && this.averageC3 <= 100) {
			this.isPass = true;
			System.out.println(c3.name + " Dersini gectiniz!");
		} else {
			this.isPass = false;
			System.out.println(c3.name + "Dersinden kaldiniz...");
		}
	}
	public void printNote() {
		System.out.println("Branch: " + this.c1.name + " " + "Note: " + this.c1.note);
		System.out.println("Branch: " + this.c2.name + " " + "Note: " + this.c2.note);
		System.out.println("Branch: " + this.c3.name + " " + "Note: " + this.c3.note);
	}
	public void printPerformans() {
		System.out.println("Branch: " + this.c1.name + " " + "Performans Note: " + this.c1.pNote);
		System.out.println("Branch: " + this.c2.name + " " + "Performans Note: " + this.c2.pNote);
		System.out.println("Branch: " + this.c3.name + " " + "Performans Note: " + this.c3.pNote);
	}
	
}
