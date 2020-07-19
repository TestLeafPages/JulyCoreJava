package week1.day2;

public class LearnConditions_ElseIf {
public static void main(String[] args) {
	int a = 54, b = 23, c = 75;
	if(a>b && a>c) {
		System.out.println("A is greater");
	}
	else if(b>a && b>c) {
		System.out.println("B is greater");
	}
	else {
		System.out.println("C is greater");
	}
}
}
