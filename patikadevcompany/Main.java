package patikadevcompany;

public class Main {

	public static void main(String[] args) {
		Firm dcSoftware = new Firm("DC Software", "Bilkent Cyberpark");
		Workers deniz = new Workers("Deniz", "Recber", 15000, 45, 2005);
		dcSoftware.addEmployee(deniz);
		dcSoftware.employeeInfo();
		dcSoftware.riseSalaries();
		dcSoftware.employeeInfo();
	}

}
