package week2.day1;

public class LearnStatic {
	int value = 5;
	static int value1 = 5;
	
	public void set() {
		LearnStatic obj = new LearnStatic();
		obj.value+=5;
		LearnStatic.value1+=5;
	}
	
	
	public static void main(String[] args) {
		LearnStatic obj1 = new LearnStatic();
		obj1.set();
		System.out.println(obj1.value);
		System.out.println(LearnStatic.value1);
	}
}
