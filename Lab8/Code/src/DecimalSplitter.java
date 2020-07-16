public class DecimalSplitter {
	static boolean isOdd(int num) {
//Complete the logic
		return num%2==1;
	}
	static int getWhole(double num) {
//Complete the logic
		return (int)num;
	}
	static double getFraction(double num) {
//Complete the logic
		String ds = String.valueOf(num);
		int index = ds.indexOf(".");
		return Double.valueOf(ds.substring(index));
	}
}