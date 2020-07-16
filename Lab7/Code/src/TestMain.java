public class TestMain {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Please enter 3 marks!");
			System.exit(0);
		}
		int m1 = Integer.parseInt(args[0]);
		int m2 = Integer.parseInt(args[1]);
		int m3 = Integer.parseInt(args[2]);
				
		ResultFinder finder = new ResultFinder();
		
		finder.setM1(m1);
		finder.setM2(m2);
		finder.setM3(m3);
		finder.displayMarks();
		
		System.out.println("Total : " + finder.getTotal());
		System.out.println("Average : " + finder.getAverage());
		System.out.println("Result : " + finder.getResult());
	}
}