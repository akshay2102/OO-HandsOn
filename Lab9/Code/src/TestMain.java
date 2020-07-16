public class TestMain {
	public static void main(String[] args) {
		
	// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		
		Employee employees[] = new Employee[4];
		for(int i=0;i<employees.length;i++) {
			System.out.println("\nFor Employee: "+(i+1));
			Employee e = new Employee();
			Roles r = new Roles();

			System.out.print("EmpID: ");
			e.setEmpID(Console.readLine());
			System.out.print("Name: ");
			e.setEmpName(Console.readLine());
			System.out.print("RoleID: ");
			r.setRoleID(Console.readInt());
			e.setRole(r);
			System.out.print("Basic: ");
			e.setBasic(Console.readDouble());
			System.out.print("HRA: ");
			e.setHra(Console.readDouble());
			System.out.print("Allowance Percentage: ");
			e.setAllowPrcnt(Console.readDouble());
			// Assign objects of Employee to employees declared above
			employees[i]=e;
		}
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
	//	Create an object of EmployeeReport
		EmployeeReport er = new EmployeeReport();
		er.setDtReport(dtReport);
	// Invoke display() method by passing the employee array
		er.display(employees);
	}		
}












