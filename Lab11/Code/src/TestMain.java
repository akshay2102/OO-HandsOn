public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		System.out.print("Enter number of Employees: ");
		int n = Console.readInt();
		Employee employees[] = new Employee[n];
		for(int i=0;i<employees.length;i++) {
			String empID, empName;
			int roleID;
			double basic, hra, allowprct;
			
			System.out.println("\nFor Employee: "+(i+1));
			System.out.print("EmpID: ");
			empID = Console.readLine();
			System.out.print("Name: ");
			empName = Console.readLine();
			System.out.print("RoleID: ");
			roleID = Console.readInt();
			System.out.print("Basic: ");
			basic = Console.readDouble();
			System.out.print("HRA: ");
			hra = Console.readDouble();
			System.out.print("Allowance Percentage: ");
			allowprct = Console.readDouble();
			// Assign objects of Employee to employees declared above
			employees[i] = new Employee(empID, empName, basic, hra, allowprct, roleID);
		}
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport er = new EmployeeReport(dtReport);
	// Invoke display() method by passing the employee array
		er.display(employees);
	}		
}












