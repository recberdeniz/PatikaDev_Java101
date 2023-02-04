package patikadevclassp1;

public class Teacher {
	public String name;
	public String phone;
	public String branch;
	
	public Teacher(String name, String branch, String phone) {
		this.name = name;
		this.branch = branch;
		this.phone = phone;
	}
	
	void infoTeacher() {
		System.out.println("Name: " + this.name);
		System.out.println("Branch: " + this.branch);
		System.out.println("Phone: " + this.phone);
	}
}
