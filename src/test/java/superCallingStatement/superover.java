package superCallingStatement;

public class superover   //extends object
{
	superover(int a)
	{
		System.out.println("*its a first statement*");
	}
}
class second_sub extends superover
{
	second_sub(String name)
	{
		super(33);
		System.out.println("**second statement**");
	}
}
class third_sub extends second_sub
{
	third_sub(int num,String add)
	{
		super("anil");
		System.out.println("***third statement***");
	}
	public static void main(String[] args) {
		new third_sub(123,"bangalore");
	}
}
