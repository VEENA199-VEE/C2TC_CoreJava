package SelfStudyPrograms;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

/*
 * no Duplicate values
 * Iterator order maintained
 * permits null values
 * Implements Set Interface
 * Not Synchronized
 * Underlying Data structure is HashTable, Objects are inserted based on HashCode
 * Internal Working is based on HashMap
 * Initial Capacity
 * Load Factor = Number of elements present / Size of HashTable
 * Default initial capacity is 16 & load factor is 0.75
 * HasSet h=new HashSet(); 
 * HasSet h= new HasSet(int initialCapacity);
 * HasSet h= new HasSet(int initialCapacity,float loadFactor);
 */

public class HashSetExample {

	public static void main(String[] args) {
		
	
		int[] a = {1, 4,1,3,7,3,4};
		Set<Integer> s=  new HashSet<Integer>();
		
		for (int i= 0; i<a.length;i++) {
		s.add(a[i]);
		
	}

	
	Iterator<Integer> i= s.iterator();
	while(i.hasNext()) {
	
	
		System.out.println(i.next() + " ");
	}
}
}
		

	



	
		

	


