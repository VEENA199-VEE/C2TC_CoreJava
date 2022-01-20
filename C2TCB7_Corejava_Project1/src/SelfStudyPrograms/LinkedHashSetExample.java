package SelfStudyPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * no Duplicate values
 * Iterator order maintained
 * permits null values
 * Implements Set Interface,extends HashSet Class
 * Not Synchronized
 * Underlying Data structure is HashTable & Doubly Linked List
 * Internal Working is based on HashMap
 * Initial Capacity
 * Load Factor = Number of elements present / Size of HashTable
 * Default initial capacity is 16 & load factor is 0.75
 * LinkedHasSet h=new LinkedHashSet(); 
 * LinkedHasSet h= new LinkedHasSet(int initialCapacity);
 * LinkedHasSet h= new LinkedHasSet(int initialCapacity,float loadFactor);
 */

public class LinkedHashSetExample {

	public static void main(String[] args) {
		int[] a = {1, 4,1,3,7,3,4};
		
		Set<Integer> s=  new LinkedHashSet<Integer>();
		
		for (int i= 0; i<a.length;i++) {
		s.add(a[i]);
		
	}

	
	Iterator<Integer> i= s.iterator();
	while(i.hasNext())
	
	
		System.out.println(i.next() + " ");
	}
}
		

	



	
		

	


