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
			Employee e = empArr[i];
			System.out.println(e.getEmpID()+"\t"+e.getEmpName()+"\t"+RoleBuilder.getRoleDescription(e.getRole().getRoleID())+"\t"+e.getBasic()+"\t"+e.getHra()+"\t"+e.getAllowance()+"\t"+e.getSalary());
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