package superCallingStatement;

public class sss
{ 
	sss(/*int a*/)
	{
		System.out.println("**hello");
		//System.out.println(a);//interenally super calling statement is present 
	}
}
class aaa extends sss
{
	aaa()
	{ //super(20);
	System.out.println("**hihello**");//if it not written then it will not print any value in second line 
	}//internally super calling statement is present 
}
class ss extends aaa
{
	ss(/*int a, String name*/)
	{
		System.out.println("hello print**");
	}
	public static void main(String[] args) 
	{
		new ss(/*113,"anananan"*/);
	}
}