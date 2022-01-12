package Dec_29_Operators;

public class Increment_Operator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+(b++)+(++a)-b;
		System.out.println(c);
		
		//int c=10+20+11-20;21
		int d=(a++)+b+a+(++b);
		System.out.println(d);
		//int d=11+21+11+22;65
			

	}

}
