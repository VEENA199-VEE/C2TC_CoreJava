/**
 * 
 */

package Generics;
/**
 * 
 * @author dell
 *
 */
 class GenericTest<T>{ //type parameter
	 
	 T obj;
	 void add(T obj)
	 {
		 this.obj=obj;
	 }
	 T get()
	 {
		 return obj;
	 }
 }
public class GenericClassDemo {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		GenericTest<Integer> obj=new GenericTest<Integer>();
		obj.add(2);
		System.out.println(obj.get());
		
		GenericTest<String>obj1=new GenericTest<String>();
		obj1.add("veena");
		System.out.println(obj1.get());
	

	}

}
