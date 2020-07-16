public class AccManager {
	public void fillAccountData(Account a1) {	
	//Complete the statements
		System.out.print("Enter AccNo: ");
		String accNo = Console.readLine();
		System.out.print("Enter Name: ");
		String name = Console.readLine();
		System.out.print("Enter Balance: ");
		double balance = Console.readDouble();
		a1.setAccNo(accNo);
		a1.setName(name);
		a1.setBalance(balance);
	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
