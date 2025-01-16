package demo.programs.demo;
import java.util.Scanner;

public class GradeOfTheStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int marks=sc.nextInt();
		if(marks<=100 && marks>=70)
		{
			System.out.println("grade is "+"A");
		}
		else if(marks<70 && marks>=60)
		{
			System.out.println("grade is "+"B");
		}
		else if(marks<59 && marks>=35)
		{
			System.out.println("grade is "+"C");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
