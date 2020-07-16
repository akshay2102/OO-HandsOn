public class Employee {
	
	// Identity variables of Employee 
	private String empID;
	private String empName;
	private double basic;
	private double hra;
	private double allowPrcnt;
	private Roles role;
	
	// parameterized constructor
	public Employee(String empID, String empName, double basic, double hra, double allowPrcnt, int roleID) {
		this.empID = empID;
		this.empName = empName;
		this.basic = basic;
		this.hra = hra;
		this.allowPrcnt = allowPrcnt;
		this.role = new Roles();
		this.role.setRoleID(roleID);
	}
	
	// getSalary() method 
	public double getSalary() {
		return SalaryCalculator.getSalary(this);
	}
	// getAllowance() method
	public double getAllowance() {
		return SalaryCalculator.getAllowance(this);
	}
	
	// Create getter and setter methods
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getAllowPrcnt() {
		return allowPrcnt;
	}
	public void setAllowPrcnt(double allowPrcnt) {
		this.allowPrcnt = allowPrcnt;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}	
}












