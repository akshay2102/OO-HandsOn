public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();
		
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		
		System.out.println("Address City : ");
		String city = Console.readLine();
		
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		
		Address addr = new Address();
		addr.setAddr1(addrLine1);
		addr.setAddr2(addrLine2);
		addr.setCity(city);
		addr.setPin(pin);
		
		emp.setAddr(addr);
		emp.setEmpID(empId);
		emp.setEmpName(name);
	}
	
	public static void showData(Employee emp) {
		System.out.println("Emp Id : "+emp.getEmpID());
		System.out.println("Name : "+emp.getEmpName());
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : "+emp.getAddr().getAddr1());
		System.out.println("Addr Line2 : "+emp.getAddr().getAddr2());
		System.out.println("City : "+emp.getAddr().getCity());
		System.out.println("Pin : "+emp.getAddr().getPin());
		System.out.println("--------------------------------------------");
	}
}