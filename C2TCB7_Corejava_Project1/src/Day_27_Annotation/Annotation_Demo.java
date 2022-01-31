package Day_27_Annotation;

import java.lang.annotation.Annotation;

@SmartPhone(os="Android", version=6)
class Nokia_Series
{
String model;
int screensize;
public Nokia_Series(String model, int screensize) {
	this.model = model;
	this.screensize = screensize;
}

}


public class Annotation_Demo {

	public static void main(String[] args) {
		Nokia_Series obj=new Nokia_Series("Fire", 4);
		System.out.println(obj.model);
		System.out.println(obj.screensize);
		Class c=obj.getClass();
	//System.out.println(c);
		//SmartPhone s=
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		System.out.println(s.version());
	}
}

	

	


