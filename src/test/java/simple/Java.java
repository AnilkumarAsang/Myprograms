package simple;

public class Java {
	 int a=10;
	 int c;
static void disp()
{
	int a=50;
	int b=30;
	int c=a+b;
	System.out.println(c);
}
public static void main(String[] args) {
	Java a=new Java();
	System.out.println(a.a);
	disp();
	System.out.println(a.c);
}
}