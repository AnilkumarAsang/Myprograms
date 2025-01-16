package programs;

public class Summ_while
{          // input 12452
public static void main(String[] args) 
{
	int no=12452;
	int sum=0;
	while(no!=0)
	{
		int z=no%10;
		sum=sum+z;
		no=no/10;
	}
	System.out.println("output of the given value is ="+sum);
		
	}

}
