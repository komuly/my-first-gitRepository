package johnCaveOfProgramming;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJava{
	//ArrayList follow insertion order.
	//ArrayList can have duplicate value.
	public static void main(String[] args) {
		
		List arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add("you");
		arrayList.add(true);
		arrayList.add(3.78);
		arrayList.add(2345);
		arrayList.add(5);
		System.out.println(arrayList);
		
		List<Integer> arrayList1= new ArrayList<Integer>();
		arrayList1.add(6);
		arrayList1.add(6);
		System.out.println(arrayList1);
		
		List<Long> arrayList2 = new ArrayList<Long>();
		arrayList2.add((long) 3449568);
		
		List<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(60);
		arrayList3.add(69);
		arrayList3.add(5);
		arrayList3.addAll(arrayList);
		System.out.println("after adding arrayList3 into arrayList " + arrayList3);
		
		arrayList.remove(arrayList3);
		System.out.println("after removing arrayList3 from arrayList " + arrayList);
		
		arrayList.add(3,"kyle");
		System.out.println("after adding an object into the index 3 " + arrayList);  
		
		arrayList.retainAll(arrayList3);
		System.out.println("after retaining both List " + arrayList); 
		 
	}

	
}
