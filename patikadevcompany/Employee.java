package patikadevcompany;

public abstract class Employee {
	protected String name;
	protected String surname;
	protected double salary;
	protected int workHours;
	protected int hiredYear;
	
	public Employee(String name, String surname, double salary, int workHours, int hiredYear) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.workHours = workHours;
		this.hiredYear = hiredYear;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract double calcTax();
	public abstract double calcBonus();
	public abstract void riseSalary();
	public abstract void showInfo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHiredYear() {
		return hiredYear;
	}

	public void setHiredYear(int hiredYear) {
		this.hiredYear = hiredYear;
	}

	
}
