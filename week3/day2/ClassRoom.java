package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassRoom {
public static void main(String[] args) {
	String str = "testleaf";
	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for (int i = 0; i < str.length(); i++) {
		char eachCharacter = str.charAt(i);
		if(map.containsKey(eachCharacter)) {
			map.put(eachCharacter, map.get(eachCharacter)+1);
		}
		else {
			map.put(eachCharacter, 1);
		}
	}
	System.out.println(map);
}
}
