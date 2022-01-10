package oops;
class Addition
{
	



	public void add()
	{
		int a=20, b=10;
		int c=a+b;
		System.out.println(c);
	}
}
	
	
class subtraction
{
	public void sub()
	{
		int a=20, b=10;
		int c=a-b;
		System.out.println(c);
	}
}
class division
{
	public void div()
	{
		double a=20,b=2.5;
		double c=a/b;
		System.out.println(c);
	}
	
	}
class moduloDivision
{
	public void mod()
	{
		int a=20,b=10;
		int c=a%b;
		System.out.println(c);
	}
}
     public class Calculator  {

 

	public static void main(String[] args) {
		Addition a1 = new Addition();
		System.out.println("The addition of two numbers are");
		a1.add();
		subtraction a2=new subtraction ();
		System.out.println("The subtraction of two numbers are");
		a2.sub();
		division a3=new division ();
		System.out.println("The division of two numbers are");
		a3.div();
		moduloDivision a4=new moduloDivision();
			System.out.println("The modulo division of two numbers are");
	}
		
		
		
	

	}


