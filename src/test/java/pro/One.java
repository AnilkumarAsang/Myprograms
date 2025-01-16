package pro;

public class One {
	public static void main(String[] args) {
		
		try {
		System.out.println(1/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("****************************************************************");
		int a[]= {1,2,3,4};
		
			try {
			System.out.println(a[6]);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println("****************************************************************");
			
			One o=null;
			try {
			System.out.println(o.hashCode());
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("****************************************************************");
		}
	}

	
	


