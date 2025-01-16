package demo.programs.demo;

public class Duplicate {
	public static void main(String[] args) {
		int a[]={3,7,1 ,6,9,5};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
			{
				System.out.println("Duplicate found "+a[i]);
				flag=true;
			}
		}
	}
if(flag==false)
{
	System.out.println("Duplicate not found");
}
}
}