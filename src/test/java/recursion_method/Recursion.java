package recursion_method;

import java.util.Scanner;

public class Recursion 
{
 void take_value_from_main_method(int no)
{
	 if(no<=20)
	 {
		 System.out.println("Give gap bewteen one by one value ");
		 System.out.println("print value of no: "+no);
		 no++;
		 take_value_from_main_method(no);
	 }
}
public static void main(String[] args) {
	Recursion R=new Recursion();   //  we have to crate the object due to we ahve used not static method 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	R.take_value_from_main_method(sc.nextInt()); //reference_variable.method_name();
	//r.take_value_from_main_method(1);  //withou scanner class 
}
}
