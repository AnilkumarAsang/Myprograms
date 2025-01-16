package linear_search;

public class print999 {
public static void main(String[] args) {
	int num=1003;
	number(num);
}
static void number(int num)
{
	int num1=num,count=0;
	
	
	while(num!=0)
	{
		int a=num%10;
		if(a==1)
		{
			count++;
		}
		num=num/10;
	}
	if(count==0)
	{
		System.out.println(num1);
	}
	else
	{
		num1--;
		number(num1);
	}
}
}
