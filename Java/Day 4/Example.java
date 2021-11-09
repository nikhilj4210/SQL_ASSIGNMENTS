package Day_4_Assignments;

import java.util.ArrayList;
import java.util.List;

public class Example {
		   public static void main(String[] args) {
		      List<Student> studentlist = new ArrayList<Student>();
		      studentlist.add(new Student("Nikhil", 22, 1001)); 
		      studentlist.add(new Student("Akhil", 19, 1003)); 
		      studentlist.add(new Student("Chetan", 23, 1005)); 
		      studentlist.add(new Student("Ram", 20, 1010)); 
		      studentlist.add(new Student("Raju", 18, 1111));
		      System.out.println("Before Sorting the student data:"); 
		 
		      //java 8 forEach for printing the list 
		      studentlist.forEach((s)->System.out.println(s));

		      System.out.println("After Sorting the student data by Age:"); 

		      //Lambda expression for sorting by age 
		      studentlist.sort((Student s1, Student s2)->s2.getAge()-s1.getAge()); 

		      //java 8 forEach for printing the list
		      studentlist.forEach((s)->System.out.println(s));         

		      
		   }

	}




