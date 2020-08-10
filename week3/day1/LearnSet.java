package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> set = new LinkedHashSet<String>();
	set.add("Sarath");
	set.add("Hari");
	set.add("Bowya");
	set.add("Dhivya");
	set.add("Hari");
	set.add("Naveen");
	set.add("Balaji");
	List<String> list = new ArrayList<String>(set);
	list.addAll(set);
	
	
	
	for (String eachvalue : set) {
		
	}
	System.out.println(set);
}
}
