package Contsructor1_over_loading;

public class constructor3 
{
	constructor3(int a)
	{
		System.out.println("first print ");
	}
	constructor3(String name)
	{
		this(20);
		System.out.println("second print");
	}
	constructor3(int num, String name2)
	{
		this("anil");
		System.out.println("third print");
	}
	constructor3(String name3,int a1)
	{
		this(201,"sunil");
		System.out.println("fourth print");
	}
	public static void main(String[] args) {
		new constructor3("sindagi",222);
	}
}
