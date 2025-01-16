package demo.programs.demo;
import java.util.Scanner;
class Powerno
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter the power:");
		int pow=sc.nextInt();
		double power= Math.pow(num,pow);
		System.out.println(num+"^"+pow+"="+power);
		}

}