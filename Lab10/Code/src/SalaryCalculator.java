public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		
	// Complete the logic
		salary = getAllowance(emp)+emp.getBasic()+emp.getHra();
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = 0.0;

	// Complete the logic
		allowance = emp.getBasic()*emp.getAllowPrcnt()*0.01;
		return allowance;
	}
}
