
package Day_11_Exception_Handling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		try {
			int data=100/0;
		
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
      System.out.println("rest of code.....");
	}

}
