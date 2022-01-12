package Exception_Handling_jan_12_Throws;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
				try
			{
					int x=10/10;
				try 
				{
					int y=10/0;
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
				finally
				{
					System.out.println("finally block");
					try
					{
						int y=10/0;
					}
					catch(Exception e)
					{
						try
						{
							int z=30/30;
						}
						finally
						{
							System.out.println("In finally under catch");
						}
						System.out.println(e);
					}
				}
		
	


	}

}
