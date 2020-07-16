public class TestMain {
	public static void main(String[] args) {
		SwapData obj = new SwapData();

		int arg1 = 0;
		int arg2 = 0;

//Read values of arg1 and arg2 from Console
		System.out.print("Enter arg1: ");
		arg1 = Console.readInt();
		System.out.print("Enter arg2: ");
		arg2 = Console.readInt();

// Call set methods of SwapData object
		obj.setArg1(arg1);
		obj.setArg2(arg2);
		obj.displayValues("Before Swapping...");

		obj.swapValues();

		obj.displayValues("After Swapping...");
	}
}