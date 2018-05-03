package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

	public static void main(String[] args) {
		
		Map<Integer,String> hashMap= new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		testMap(hashMap); // doesn't maintain insert order
		testMap(treeMap);// it doesn't follow insert order
		
		//hashMap and treeMap both of them doesn't follow insertion order ,
		
		testMap(linkedHashMap);// linkedHashMap does maintain order
	}
	
	public static void testMap(Map<Integer,String> map){
		map.put(5, "gulshen");
		map.put(2, "Key");
		map.put(0, "children");
		map.put(3, "cat");
		
		for(Integer key: map.keySet()){
			String value= map.get(key);
			System.out.println(key + ":" + value);
		}
		
		
	}
}
