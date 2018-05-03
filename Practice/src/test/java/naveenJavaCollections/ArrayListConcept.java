package naveenJavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
	
	int a[] = new int[3];// STATIC ARRAY and size is fixed
	
	//dynamic array--ArrayList
	//1. can contain duplicate values/elements
	//2.maintains insertion order
	//3.Synchornized
	//4.allows randow access to fetch the element because it stores
	//the values on the basis of indexes
	ArrayList ar = new ArrayList();
	
	 ar.add(100);
	ar.add(99);
	ar.add(0);
	ar.add(20);
	ar.add(25);
	
	System.out.println(ar.size());
	
	ar.add(25);
	ar.add(19);
	ar.add(19);
	ar.add(1);
	ar.add("you");
	ar.add('C');
	ar.add(true);
	ar.add(23.35);
	
	System.out.println(ar.size());
	
	for(int i= 0;i<ar.size();i++){
		System.out.println("total index value is : " + ar.get(i) );
	}
	
	//no generic vs generic
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	
	ar1.add(3);
	ar1.add(200);
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("java");
	ar2.add("new york");
	ar2.add("arlington");
	
	ArrayList<E> ar3 = new ArrayList<E>();
	
//???
	//Employees class Objects
Employees el1 = new Employees("key",3,"QA");
Employees el2 = new Employees("ode",5,"QA");
Employees el3 = new Employees("jose",6,"Dev");
Employees el4 = new Employees("Tom",1,"PA");

//create ArrayList

ArrayList<Employees> ar4 = new ArrayList<Employees>();
	ar4.add(el1);
	ar4.add(el2);
	ar4.add(el3);
	ar4.add(el4);
	
	// Iterator to traverse the values:
	Iterator<Employees> it = ar4.iterator();
	while(it.hasNext()){
		Employees emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.dept);
		System.out.println(emp.age);
	}
	//***************
	
	//addAll()
ArrayList<String> ar5 = new ArrayList<String>();
ar5.add("test");
ar5.add("regression");
ar5.add("jenkins");
ar5.add("git-hub");

ArrayList<String> ar6 = new ArrayList<String>();
ar6.add("selenium");
ar6.add("agile");
ar6.add("cicd");

//ar5.addAll(ar6);
//ar6.addAll(ar5);

/*for(int i =0; i<ar5.size();i++){
	System.out.println(ar5.get(i));
}*/
/*for(int y =0; y<ar6.size();y++){
	System.out.println(ar6.get(y));
}
*/
//removeAll:
ar6.removeAll(ar5);
//ar5.removeAll(ar6);
for(int i =0;i<ar6.size();i++){
	System.out.println(ar6.get(i));
}

//retainAll: common element from both table

ArrayList<String> ar7 = new ArrayList<String>();
ar7.add("test");
ar7.add("regression");
ar7.add("jenkins");
ar7.add("git-hub");

ArrayList<String> ar8 = new ArrayList<String>();
ar8.add("selenium");
ar8.add("agile");
ar8.add("cicd");
ar8.add("regression");

ar7.retainAll(ar8);
for(int i=0;i<ar7.size();i++){
System.out.println(ar7.get(i));
}

	
	
	
	
	

	}
	
}
