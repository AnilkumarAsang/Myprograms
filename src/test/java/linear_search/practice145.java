package linear_search;

public class practice145 {
public static void main(String[] args) {
	int num=856;
	calling (num);	
}
static void calling(int num)
{
	int num1=num,count=0;

     while(num!=0)
     {
    	 int a=num%10;//4 
    	 if(a==8)
    	 {
    		 count++;
    	 }
    	 num=num/10;//21 2
     }
     
     if(count==0)
     {
    	 System.out.println(num1);
     }
     else
     {
    	 num1--;
    	 calling(num1);
     }
}
}
