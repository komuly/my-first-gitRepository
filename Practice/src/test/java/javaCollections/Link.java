package javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Link {

	public static void main(String[] args) {
	
		// ArrayLists manage arrays internally;
		//[0]1[2]3[4][5][6][7][8].....
		
		
	//if you want to add or remove items from the end of list use ArrayList
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	/*LinkedLists consists of elements where each element
	has a reference to the previous and next element
	[0]->[1]->[2]-[3]'''
	[4]--<[5]-<[6]--<[7]...*/
	//if you want to add or remove items anywhere in the list use LinkedList
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	doTimings("ArrayList",arrayList);
	doTimings("LinkedList",linkedList);
	} 
	
	private static void doTimings(String type, List<Integer> list){
		
		for(int i=0; i<1E5;i++){
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
	/*	// add items at end of list ArrayList is very fast
		for(int i=0; i<1E5; i++){
			list.add(i);
		}*/
		
		//add items elsewhere in list,Linked list is very fast
		
		for(int i=0; i<1E5;i++){
			list.add(0, i);
			//list.add(list.size()-100, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-start) + "ms for " + type);
		
	}
}
