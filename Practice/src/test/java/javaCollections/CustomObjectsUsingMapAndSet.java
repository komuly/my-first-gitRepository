package javaCollections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Class{
	
	private int id;
	private String name;
	public Class(int id,String name){
		this.id = id;
		this.name= name;
	}
}
public class CustomObjectsUsingMapAndSet {
	/*public void SetMethod(int id,String name){
		SetMethod(5,"dude");*/ 
	
	public static void main(String[] args) {
		
		//Map<String,Integer> map = new HashMap<String,Integer>();
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put("two", 2);
		map.put("zero", 0);
		map.put("six", 6);
		map.put("two", 2);
		map.put("seven", 7);
		
		//System.out.println(map);
		
		for(String key: map.keySet()){
			System.out.println(key + ":" + map.get(key));
			
		}
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("cat");
		set.add("dog");
		set.add("horaz");
		set.add("ordek");
		set.add("muxuk");
		System.out.println(set);
		
	}
}
