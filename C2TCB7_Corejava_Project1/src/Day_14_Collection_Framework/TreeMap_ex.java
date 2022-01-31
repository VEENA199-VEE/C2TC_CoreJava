package Day_14_Collection_Framework;
import java.util.*;

public class TreeMap_ex
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String> map= new TreeMap<Integer,String>();
		map.put(100, "vinay");
		map.put(102, "vikas");
		map.put(101, "rashmi");
		map.put(103, "shree");
		//map.put(null,"Xaviour");
		map.put(105, null);
		//removing entry based on key
		//get an entry
		//replace an entry
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
			
		}

	}

}
