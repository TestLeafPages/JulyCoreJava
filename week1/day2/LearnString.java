package week1.day2;

public class LearnString {
public static void main(String[] args) {
	int a = 5;
	// String is a class
	// String is immutable in nature
	// Creating a string - I {String Literal}
	String str1 = "Test";
	String str4 = "Test";
	// == -> equate only the memory location & not the value
	if(str1==str4) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
	// Creating a String - II {String Object}
	String str2 = new String("Test");
	String str3 = new String("Test");
	if(str2==str3) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
	if(str2.equals(str3)) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not Equal");
	}
	
	
}
}
