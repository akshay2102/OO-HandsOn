public class Cache {
	private static int MAX_CAPACITY = 0;
	
	// Implement static block
	static {
		while(MAX_CAPACITY<1) {
			System.out.println("Enter Max Capacity: ");
			MAX_CAPACITY = Console.readInt();
		}
	}
	static int getMaxCapacity() {
		System.out.println("Returning MAX_CAPACITY");
		return MAX_CAPACITY;
	}
}