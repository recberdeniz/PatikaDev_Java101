package patikadevcompany;

import java.util.ArrayList;

public class Firm {
	private String companyName;
	private String companyAddress;
	private ArrayList<Employee> employeeList = new ArrayList<Employee>(); 
	
	public Firm(String companyName, String companyAddress) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}
	
	public void addEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
	}
	
	public void employeeInfo() {
		for(Employee e: employeeList) {
			e.showInfo();
		}
	}
	public void riseSalaries() {
		for(Employee e: employeeList) {
			e.riseSalary();
		}
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
