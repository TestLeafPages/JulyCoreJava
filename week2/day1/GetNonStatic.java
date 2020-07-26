package week2.day1;

public class GetNonStatic {
public static void main(String[] args) {
	LearnStatic obj = new LearnStatic();
	System.out.println(obj.value);
	System.out.println(LearnStatic.value1);
}
}
