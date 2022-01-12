package Basic_Programs;
class Box
{
	float width;
	float height;
	float length;

	float calcvol() {
		return width*height*length;
	}
	}

public class BoxDemo {

	public static void main(String[] args) {
		Box box1;
		box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.length=1.4f;
		float vol=box1.calcvol();
		System.out.println("Volume of Box1 is "+vol);
		
	      Box box2;
		box2=new Box();
		box2.width=5.4f;
		box2.height=1.1f;
		box2.length=3.2f;
		 vol=box2.calcvol();
		System.out.println("Volume of Box2 is " +vol);

		
		

}

	

	}


