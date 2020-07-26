package week2.day1;

public class OccuranceOfWords {
public static void main(String[] args) {
	String str = "No sentence starts with because because because is a conjunction";
	String[] split = str.split("because");	
	System.out.println(split.length-1);
	
	/*
		 * int count = 0; String[] array = str.split(" "); for (int i = 0; i <
		 * array.length; i++) { if(array[i].equals("because")) { count++; } }
		 * System.out.println(count);
		 */
}
}
