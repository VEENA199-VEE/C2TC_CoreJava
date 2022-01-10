
package com;

	class Student1
	{
		int sid;
		String sname;
		String courseName;	
		
		Student1()
		{
			System.out.println("It is a default constructor");
		}
		
		public Student1(int sid) 
		{
			this.sid = sid;
		}

		Student1(int id, String name)
		{
			sid=id;
			sname=name;
		}
		
		
		public Student1(int sid, String sname, String courseName)
		{
			this.sid = sid;
			this.sname = sname;
			this.courseName = courseName;
		}

		void getInfo()
		{
		System.out.println("Student id is "+ sid);
		System.out.println("Student name is "+ sname);
		System.out.println("Student course is "+ courseName);
		}
		
	}

	public class ConstructorOverloadingDemo { 

		public static void main(String[] args) {
			 Student1 obj=new Student1(101); 
			 Student1 obj1=new Student1(102,"Sahiti","JAVA_SELENIUM"); 
			 Student1 obj2=new Student1(103,"Sanjay"); 
			 Student1 obj3=new Student1(); 
			 
			 obj.getInfo();
			 obj1.getInfo();
			 obj2.getInfo();
			 obj3.getInfo();
			 
			
			 
		}

	}

