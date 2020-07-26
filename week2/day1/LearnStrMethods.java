package week2.day1;

public class LearnStrMethods {
public static void main(String[] args) {
		/*
		 * String str = "Testleaf"; // To find the length of the string int strLength =
		 * str.length(); System.out.println("Length of the String: "+strLength); // To
		 * convert to lowercase String lowerCase = str.toLowerCase();
		 * System.out.println("Lower case String: "+lowerCase); String upperCase =
		 * str.toUpperCase(); // To remove the spaces in the front and back of the
		 * string System.out.println("Upper case String: "+upperCase); String str1 =
		 * "     Test leaf    "; System.out.println("with spaces: "+str1); String trim =
		 * str1.trim(); System.out.println("without spaces: "+trim); // String
		 * comparison String str2 = "Testleaf is in Chennai"; String str3 = "Chennai";
		 * //Exact comparison boolean equals = str2.equals(str3);
		 * System.out.println(equals); // comparing the strings with ignoring the case
		 * boolean equalsIgnoreCase = str2.equalsIgnoreCase(str3);
		 * System.out.println(equalsIgnoreCase); // To verify a part of text is
		 * available in the String boolean contains = str2.contains(str3);
		 * System.out.println(contains);
		 */
	
		/*
		 * String str = "Testleaf"; for (int i = 0; i < str.length(); i++) {
		 * System.out.println(str.charAt(i)); }
		 * char[] array = str.toCharArray(); for (int i = 0; i < array.length; i++) {
		 * System.out.println(array[i]); }
		 */
	
		/*
		 * String str = "Testleaf is in Chennai"; String[] array = str.split(" "); for
		 * (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
		 * String str = "Testleaf"; boolean startsWith = str.startsWith("Test");
		 * System.out.println(startsWith); boolean endsWith = str.endsWith("af");
		 * System.out.println(endsWith);
		 */
	
		/*
		 * String str = "Testleaf"; String substring = str.substring(4);
		 * System.out.println(substring); String substring2 = str.substring(2, 6);
		 * System.out.println(substring2);
		 */
	
	
		/*
		 * String str = "Testleaf is in Chennai"; String replace = str.replace('e',
		 * 'E'); System.out.println(replace);
		 */
	String str = "Since 1900 in Chennai";
	String replaceAll = str.replaceAll("\\D", "");
	System.out.println(replaceAll);
	
	
	
	
	
	
	
	
	
	
	









}
}
