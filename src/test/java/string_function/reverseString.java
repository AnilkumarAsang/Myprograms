package string_function;

public class reverseString {
public static void main(String[] args) {
	String str="company@anilkumar";
	String rev=""; String rev1=""; int count=0; int count1=0; String r="";
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
		if(i%2==0){
		rev=rev+str.charAt(i);
		count++;
		
		}
		else{
			rev1=rev1+str.charAt(i);
		count1++;}
	}
    System.out.println(rev +" "+rev1);
	System.out.println("Reverse even value: "+rev+" "+"& count even values: "+count);
	System.out.println("Reverse odd value: "+rev1+" "+"& count odd values: "+count1);
	System.out.println("***************practice*****************");
	 r=str.replace('a', 'x');
	System.out.println(r);
	System.out.println(str.endsWith("mar"));
	System.out.println(str.contains("any"));
	System.out.println(str.indexOf('n'));
	System.out.println(str.charAt(3));
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
}
}
