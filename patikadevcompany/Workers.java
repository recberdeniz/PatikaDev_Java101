package patikadevcompany;

import java.time.Year;

public class Workers extends Employee{
	private double tax;
	private double bonus;
	private double riseAmount;
	private double riseRate;
	private double netSalary;
	public Workers(String name, String surname, double salary, int workHours, int hiredYear) {
		super(name, surname, salary, workHours, hiredYear);
		this.tax = calcTax();
		this.bonus = calcBonus();
		this.riseRate = calcRiseRate();
		this.riseAmount = calcRiseAmount();
		this.netSalary = calcTotalSalary();
		
	}
	
	public double calcRiseAmount() {
		double riseAmount = this.riseRate * this.salary;
		return riseAmount;
	}
	
	public double calcRiseRate() {
		int year = Year.now().getValue();
		if(year - this.hiredYear < 10) {
			this.riseRate = 0.05;
			return this.riseRate;
		} else if(year - this.hiredYear >= 10 && year - this.hiredYear < 20) {
			this.riseRate = 0.1;
			return this.riseRate;
		} else if((year - this.hiredYear) >= 20) {
			this.riseRate = 0.15;
			return this.riseRate;
		} else {
			return 0;
		}
		
	}
	
	public double calcTotalSalary() {
		this.netSalary = this.salary + this.bonus - this.tax;
		return this.netSalary;
	}

	@Override
	public double calcTax() {
		if(salary < 1000) {
			return 0;
		} else {
			return this.salary * 0.03;
		}
		
	}

	@Override
	public double calcBonus() {
		int overTime = 0;
		if(this.workHours > 40) {
			overTime = this.workHours - 40;
			this.bonus = overTime * 30;
			return this.bonus;
		} else {
			return 0;
		}
		
	}

	@Override
	public void riseSalary() {
		
		this.salary += salary * this.riseRate;
		this.tax = calcTax();
		this.bonus = calcBonus();
		this.riseRate = calcRiseRate();
		this.riseAmount = calcRiseAmount();
		this.netSalary = calcTotalSalary();
		
	}

	@Override
	public void showInfo() {
		System.out.println("==================");
		System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("Gross Salary: " + this.salary);
		System.out.println("Weekly Work Hours: " + this.workHours);
		System.out.println("Hired Year: " + this.hiredYear);
		System.out.println("Tax: " + this.tax);
		System.out.println("Rising Amount: " + this.riseAmount);
		System.out.println("Rising Rate: " + this.riseRate);
		System.out.println("Bonus: " + this.bonus);
		System.out.println("Net Salary: " + this.netSalary);
		
		
	}

}
