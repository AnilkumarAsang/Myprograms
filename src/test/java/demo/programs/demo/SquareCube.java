package demo.programs.demo;
import java.util.Scanner;

public class SquareCube {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int square=a*a;
		int cube=a*a*a;
		System.out.println("Square of "+a+" is "+square);
		System.out.println("Cube of "+a+" is "+cube);
	}

}
