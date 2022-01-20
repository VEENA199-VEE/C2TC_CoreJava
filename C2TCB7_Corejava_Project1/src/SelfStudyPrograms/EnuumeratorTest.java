package SelfStudyPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class EnuumeratorTest {

	public static void main(String[] args) {
		Vector<Integer> vector = new  Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		
		Enumeration<Integer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Integer n = elements.nextElement();
			System.out.println(n);
		
		
		}
		System.out.println("----------------");
		
		System.out.println(vector);

	}

}
