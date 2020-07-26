package week2.day1;

public class LearnConstructor {
	
	public LearnConstructor() {
		System.out.println("Welcome to constructor class");
	}
	
	
	public void print() {
		System.out.println("Hello World");
	}
public static void main(String[] args) {
	LearnConstructor obj = new LearnConstructor();
	obj.print();
}
}
