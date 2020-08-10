package week3.day2;

public class LearnExceptions {
	public void stop() throws InterruptedException {
		Thread.sleep(5000);
	}
	
public static void main(String[] args) {
		/*
		 * System.out.println("Hello"); Thread.sleep(5000);
		 * System.out.println("Testleaf");
		 */
	try {
	int[] array = new int[5];
	System.out.println(array[5]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index is out of range");
	}
	System.out.println("After the execution");
}
}
