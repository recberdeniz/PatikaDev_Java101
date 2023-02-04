package patikadevclassp1;

public class Course {
	public String name;
	public String code;
	public String prefix;
	public int note;
	public int pNote;
	public Teacher teacher;
	
	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int pNote = 0;
	}
	public void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		} else {
			System.out.println("Access denied!");
		}
		
	}
	
	public void teacherInfo() {
		
		this.teacher.infoTeacher();
		
	}
}
