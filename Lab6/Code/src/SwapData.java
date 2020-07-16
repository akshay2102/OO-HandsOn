public class SwapData {
	private int arg1;
	private int arg2;

	public void swapValues() {
	//Logic to swap values
		arg1 = arg1 + arg2;
		arg2 = arg1 - arg2;
		arg1 = arg1 - arg2;
	}

	public void displayValues(String str) {
	//Display string message with values of arg1 and arg2
		System.out.println(str+" "+arg1+" "+arg2);
	}

// Create setter and getter methods
	public int getArg1() {
		return arg1;
	}

	public void setArg1(int arg1) {
		this.arg1 = arg1;
	}

	public int getArg2() {
		return arg2;
	}

	public void setArg2(int arg2) {
		this.arg2 = arg2;
	}
}