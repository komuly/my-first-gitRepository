package javaCollections;

import java.util.ArrayList;
import java.util.List;

public class ArryLst {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(50);

		System.out.println(numbers.get(2));// gets index 2=50
		System.out.println("\nIteration #1: ");
		//Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			 System.out.println(numbers.get(i));// gets allnumbers=10,100,50
			//System.out.println(i);// gets all the index = 0,1,2
		}
		// removing
		numbers.remove(numbers.size() - 1);//removes last item
	
		numbers.remove(0);//removes first item and it is slow
		
		System.out.println("\nIteration #2: ");
		for (Integer value : numbers) {
			System.out.println(value);// gets all the numbers value=10,500,50
		}
		
		//List interface...
		List<String> values = new ArrayList<String>();
	
	}

}
