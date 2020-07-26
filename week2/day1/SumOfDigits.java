package week2.day1;

public class SumOfDigits {
public static void main(String[] args) {
	String str = "AK47PK28";
	int solution = 0;
	for (int i = 0; i < str.length(); i++) {
		if(Character.isDigit(str.charAt(i))) {
			solution = solution+Character.getNumericValue(str.charAt(i));
		}
	}
	System.out.println(solution);
	int a = 5;
	String tr = a+"";
}
}
