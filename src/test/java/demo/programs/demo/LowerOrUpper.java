package demo.programs.demo;

public class LowerOrUpper {
	public static void main(String[] args) {
		char c='s';
		if(c>='A' && c<='Z')
		{
			System.out.println("uppercase");
		}
		else if(c>='a' && c<='z')
		{
			System.out.println("lowercase");
		}
		else
		{
			System.out.println("other characters");
		}
		
		
		

	}

}
