package simple;


public class djs {
	djs(int a)
	{
		System.out.println("*its a first statement*");
		System.out.println(a);
	}
}
class tamma extends djs
{
	tamma(String name)
	{
		super(33);
		System.out.println("**second statement**");
		System.out.println(name);
	}
}
class simpleeeeeeeeee extends tamma
{
	simpleeeeeeeeee(int num,String add)
	{
		super("anil");
		System.out.println("***third statement***");
		System.out.println(num+" "+add);
	}
	public static void main(String[] args) {
		new simpleeeeeeeeee(123,"bangalore");
	}
}
