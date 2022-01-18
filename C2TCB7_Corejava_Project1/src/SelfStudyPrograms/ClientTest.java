package LinkedList;

import java.util.LinkedList;

public class ClientTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//Inserts the specified element at the beginning of this list
		list.addFirst(100);
		//Insert the specified element at the end of this list
		list.add(500);
		//insert the specified element at the specified position in this list
		list.add(1,200);
		
		System.out.println(list);

	}

}
