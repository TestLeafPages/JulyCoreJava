package week1.day1;

public class LearnMethods {
//Access-Modifier return-type methodName(){  }
	public int addTwoNumbers() {
		int a = 5, b = 10;
		int solution = a+b;
		return solution;
	}
	public int multiplyTwoNumbers(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		// Create an object for a class
		// Classname object-name = new Classname();
		LearnMethods obj  = new LearnMethods();
		// how to call a method using the object
		// object.methodName();
		System.out.println(obj.addTwoNumbers());
		int sol = obj.multiplyTwoNumbers(4, 4);
		System.out.println(sol);
		
	}
}
