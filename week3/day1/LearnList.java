package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Sarath");
	list.add("Hari");
	list.add("Bowya");
	list.add("dhivya");
	list.add("Hari");
	list.add("Sam");
	Collections.sort(list);
//	Collections.reverse(list);
	System.out.println(list);
	
	int size = list.size();
	for (String eachValue : list) {
		System.out.println(eachValue);
	}
		/*
		 * list.clear(); list.isEmpty();
		 */
	
	
	
	
	
		/*
		 * for (int i = 0; i < size; i++) { System.out.println(list.get(i)); }
		 */
	
	
	
	
	
	/*
	 * list.add(1, "Balaji"); list.set(2, "Naveen"); list.remove(3);
	 * list.remove("Sarath");
	 */
}
}
