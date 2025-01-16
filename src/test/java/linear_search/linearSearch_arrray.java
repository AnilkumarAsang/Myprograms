package linear_search;
//linear search means to search the given number in existing input 
import java.util.Scanner;

public class linearSearch_arrray {
	public static void main(String[] args) {
		int []arr={10,50,60,50,10,20,50,50}; for(int r=1;r<=10;r++){
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the array value"+"srno " + r);
			int find=sc.nextInt();
			//int find=20,
			int flag=0; int count=0;
			for(int i=0; i<arr.length;i++)
			{
				if(find==arr[i])
				{ /*int a=arr[i];*/
					/*System.out.println("hhhh "+a);*/
					
					count++;//flag=1;
					//break;// if we want to count ie how many times duplicate value are present then we need to remove the break statement 
				}
				
			}
			
			System.out.println("counts "+count);
			System.out.println(find);
			if(count==0)//if(flag==0)
			{
				System.out.println("value is not found ");
			}
		}
	}
}
