package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LearnMap {
public static void main(String[] args) {
Map<String, Integer> map = new LinkedHashMap<String, Integer>();
map.put("Alto", 500000);
map.put("Polo", 1000000);
map.put("Duster", 1500000);
map.put("Swift", 1000000);
map.put("Polo", 1200000);
System.out.println(map);
System.out.println(map.get("Alto"));

for (String eachKey : map.keySet()) {
	System.out.println(eachKey+"->"+map.get(eachKey));
}

System.out.println(map.containsKey("Duster"));
System.out.println(map.containsValue(40000));

map.clear();
map.isEmpty();




		/*
		 * for (Entry<String, Integer> eachEntry : map.entrySet()) {
		 * System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue()); }
		 */
}
}
