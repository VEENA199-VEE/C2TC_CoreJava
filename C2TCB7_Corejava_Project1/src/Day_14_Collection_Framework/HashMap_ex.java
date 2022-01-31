package Day_14_Collection_Framework;

import java.util.Map;
import java.util.HashMap;

public class HashMap_ex {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		//Creating HashMap
		map.put(1,"Mango"); //Put elements in Map
		map.put(2,"Apple");
		map.put(3,"Banana");
		map.put(4,"Grapes");
		map.put(null, null);
		map.put(null,"Berry");
		map.put(5,null);
		
		System.out.println("Iterating Hashmap....");
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}

	}

}
