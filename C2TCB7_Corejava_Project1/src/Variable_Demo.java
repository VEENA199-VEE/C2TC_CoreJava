
public class Variable_Demo { 
	//class variable
	int a=1024;
	int b;
	
	void func1()
	{
		 int c;
		 c=10;
		 System.out.println("class variables" +a+""+b);
		 System.out.println("lpcal variable "+c);
		 a=7890;
		 b=56;
		 System.out.println("class variables "+a+""+b);
	}

	void func2()
	{
		System.out.println("class variables "+a+""+b);
		
	}
	public static void main(String[] args) {
		Variable_Demo obj=new Variable_Demo();
		obj.func1();
		obj.func2();
		

	}

}
