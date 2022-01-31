/**
 * 
 */

package Generics;
/**
 * 
 * @author dell
 *
 */

public class GenericMethod_ex {
	
	/**
	 * 
	 * @param args
	 */
  public static <E>void displayArrayElements(E[] elements)
  {
	  for (E element :  elements) {
		  
	  }
  }
	public static void main(String[] args) {
		GenericMethod_ex obj= new GenericMethod_ex();
		Integer[] intarray= {10,20,30,40};
		String[] str= {"abc","program","learning"};
		
		obj.displayArrayElements(str);
		
		
		
	}

}
