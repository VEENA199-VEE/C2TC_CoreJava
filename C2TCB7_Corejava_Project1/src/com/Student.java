package com;

public class Student {
	int id;
	String name;
	String email;
	Float usn;
	
	public Student()
	{
	}
	public Student(int id, String name, String email, Float usn) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.usn = usn;
	}
	public Student(int id) {
	this.id=id;	
	}


public String toString()
{
	String str="("+id+","+name+","+email+","+usn+")";
	return str;
}



public static void main(String[] args) {
	Student e1=new Student();
	e1.id=101;
	e1.name="Veena";e1.email="sjkghsk";
	e1.usn=18416f;
	System.out.println(e1.toString());
	
	Student e2=new Student(102,"pallavi","hdsgfh",46754f);
	System.out.println(e2.toString());
	
	Student e3=new Student(103,"'nihal","hgfty",87648f);
	System.out.println(e3.toString());
}

		

	}


