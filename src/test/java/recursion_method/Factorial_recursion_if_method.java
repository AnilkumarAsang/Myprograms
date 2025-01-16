package recursion_method;

public class Factorial_recursion_if_method 
{
	public static int fact(int x)
	{
		if(x==1)
		{
			return 1;
		}
		else 
		{
			return x*fact(x-1);
		}
	}
	public static void main(String[] args) 
	{
		
		int x=fact(5);
		System.out.println("......factorial output.....");
		System.out.println("           " + x);
		
	}}
	
		
	
	


