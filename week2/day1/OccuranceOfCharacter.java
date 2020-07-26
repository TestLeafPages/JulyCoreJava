package week2.day1;

public class OccuranceOfCharacter {
public static void main(String[] args) {
	String str = "Karma is powerful than corona";
	int length = str.replaceAll("[^a]", "").length();
	System.out.println(length);
		/*
		 * int count = 0; for (int i = 0; i < str.length(); i++) {
		 * if(str.charAt(i)=='a') { count++; } }
		 * System.out.println("Occurance of a: "+count);
		 */
}
}
