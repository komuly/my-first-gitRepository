package javaCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		// HashSet doesn't retain order
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedHashSet remembers the order you added items in
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet sorts in alphabetical order
		Set<String> set1=new TreeSet<String>();
		
		if(set1.isEmpty()){
			System.out.println("Set1 is Empty at start");
		}
		set1.add("dog");
		set1.add("cat");
		set1.add("elephent");
		set1.add("mouse");
		set1.add("horse");
		set1.add("bear");
		
		if(set1.isEmpty()){
			System.out.println("Set1 is NOT empty now");
		set1.add("mouse");
		System.out.println(set1);
		}
		for(String element: set1){
			System.out.println(element);
		}
		
		if(set1.contains("aarth")){
			System.out.println("contains aarth");
		}
		if(set1.contains("horse")){
			System.out.println(" contains horse");
		}
		
		/////////// Intersection /////////////
		Set<String> set2 = new TreeSet<String>();
		set2.add("monkey");
		set2.add("cat");
		set2.add("swan");
		set2.add("snak");
		set2.add("horse");
		set2.add("ant");
		
		// intersection only prints the existing items and new items
		Set<String> intersaction = new HashSet<String>(set1);
		intersaction.retainAll(set2);
		System.out.println(intersaction);
		
		Set<String> difference = new HashSet<String>(set1);//(set2)
		//difference.removeAll(set1); // gives only the new items in SET2
		difference.removeAll(set2);// removes the new and duplicate elements from set2 and 
		// gives items which are in the SET1
		System.out.println(difference);
		
	}
	
	
}
