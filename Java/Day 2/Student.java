package Assignments;

public class Student {
	
	int stdID;
	String stdName;
	String stdClass;

	public void display() {
		System.out.println("Student ID :"+stdID);
		System.out.println("Student name :"+stdName);
		System.out.println("Student Class :"+stdClass+"\n");
		
	}
	public static void main(String[] args) {
		Student s1 =new Student();
		s1.stdID = 01;
		s1.stdName = "Sudeep";
		s1.stdClass = "12th";
		s1.display();
		
		Student s2 =new Student();
		s2.stdID = 02;
		s2.stdName = "Nikhil";
		s2.stdClass = "12th";
		s2.display();
		
	}

}
