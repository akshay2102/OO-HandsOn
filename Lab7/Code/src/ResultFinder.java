public class ResultFinder {
	private int m1;
	private int m2;
	private int m3;
	
	// Create setter and getter methods 
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public void displayMarks() {
		System.out.println("Subject 1 Marks: " + getM1());
		System.out.println("Subject 2 Marks: " + getM2());
		System.out.println("Subject 3 Marks: " + getM3());		
	}
	
	public int getTotal() {
//		complete the logic
		return m1+m2+m3;
	}
	public double getAverage() {
//		complete the logic
		return getTotal()/3.0;
	}
	
	public String getResult() {
//		complete the logic
		double avg = getAverage();     // average is used to decide the grade of the student
		if(avg>=80)                    // ranges of grade were assumed
			return "Your Grade: A";
		else if(avg>=60 && avg<80)
			return "Your Grade: B";
		else if(avg>=40 && avg<60)
			return "Your Grade: C";
		else
			return "Your Grade: D";
	}
}
