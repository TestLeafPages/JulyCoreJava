package week1.day2;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	String name = "Balaji";
	// Creating an array - I
	String[] names1 = {"Ganga","Akila","William","Muthu"};
	// Creating an array- II
	String[] names2 = new String[4];
	names2[0] = "Lakshmi";
	names2[1] = "Aravind";
	names2[2] = "Sathya";
	names2[3] = "Susila";
	// How to find the size of the array?
	int length = names1.length;
	System.out.println(length);
	//System.out.println(names1);
	for(int i = 0; i < length; i++)
	System.out.println(names1[i]);
	System.out.println("-----------------------");
	Arrays.sort(names1);
	for(int i = 0; i < length; i++)
		System.out.println(names1[i]);
//	System.out.println(names1[4]);
	String[] numbers = new String[5];
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	
	
	
	
	
}
}
