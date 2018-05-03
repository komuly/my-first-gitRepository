package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//HashMap doesn't maintain order
	map.put(10, "Ten");
	map.put(32, "Thirty Two");
	map.put(1, "One");
	map.put(0,"Zero");
	map.put(5, "Five");
	map.put(11, "Eleven");
	map.put(100, "Hundred");
	map.put(21,"Twenty One");
	map.put(6, "Six");
	map.put(3, "Three");
	map.put(7, "Seven");
	map.put(2, "Two");
/*String text = map.get(100);
System.out.println(text);*/
	for(Map.Entry<Integer, String> entry: map.entrySet()){
		int key=entry.getKey();
		String value = entry.getValue();
		
		System.out.println(key + ":" + value);
		
	}	
		
		
	}
	}

