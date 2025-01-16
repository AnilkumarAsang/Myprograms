package Contsructor1_over_loading;

public class Student {
	 
		//instance variables of the class  
		int id;  
		String name;  
		  
		Student()//this non parameterized constructor
		{  
		System.out.println("this a default constructor");  
		}  
		  
		Student(int id, String namee)//parameterized constructor
		{  
		this.id = id;  //here i used this keyword due to gloabal and local variables are same 
		name = namee;  //here i have not used this keyword due to global and local variables are different
		}  
		  
		public static void main(String[] args) {  
		//object creation  
		Student s = new Student(/*10,"aa"*/);  
		System.out.println("\nDefault Constructor values: \n");  
		System.out.println("Student Id : "+s.id + " \nStudent Name : "+s.name);  
		  
		System.out.println("\nParameterized Constructor values: \n");  
		Student student = new Student(10, "David");  
		System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
		}  
		}  

