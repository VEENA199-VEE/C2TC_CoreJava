/**
 * 
 */

package Day_14_Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * @author user
 *
 */

public class LinkedListSet_demo {//linkedlist demo not set
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		// add elements to the linked list
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		l1.addLast("Z");
		l1.addFirst("A");
		l1.add(1,"A1");
		System.out.println("original contents of l1 :"+l1);
		
		//remove elements from the linked list
		l1.remove("f");
		l1.remove(2);
		System.out.println("contents of l1 after deletion :"+l1);
		
		//remove first and last elements 
		l1.removeFirst();
		l1.removeLast();
		System.out.println("l1 after deleting first and last"+l1);
		
		// get aand set value
		Object val1 = l1.get(0);
		l1.set(0, (String) val1 + "Changed");
		System.out.println("l1 after change : " + l1);
		
		

	}

}
