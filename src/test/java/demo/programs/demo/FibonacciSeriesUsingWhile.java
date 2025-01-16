package demo.programs.demo;
//using while loop
public class FibonacciSeriesUsingWhile {
	public static void main(String[] args) {
		int fib1=0,fib2=1,fib3;
		System.out.print(fib1+" "+fib2+" ");
		int i=1;
		while(i<=11)
		{
			fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			i++;
		}
	}

}
