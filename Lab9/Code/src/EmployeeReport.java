public class EmployeeReport {
	private String dtReport;
	
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("\nEMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		// Complete the logic 	
		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\tHRA\tALLOWANCE\tSALARY");
		for(int i=0;i<empArr.length;i++) {
			String role;
			Employee e = new Employee();
			Roles r = new Roles();
			e = empArr[i];
			r = e.getRole();
			
			System.out.println(e.getEmpID()+"\t"+e.getEmpName()+"\t"+RoleBuilder.getRoleDescription(r.getRoleID())+"\t"+e.getBasic()+"\t"+e.getHra()+"\t"+SalaryCalculator.getAllowance(e)+"\t"+SalaryCalculator.getSalary(e));
		}
		
		displayFooter(empArr.length);
		
	}
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}