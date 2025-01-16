package superCallingStatement;

public class skhajhcj
{
	skhajhcj(int a)
	{
		System.out.println(a);
		System.out.println("its first");
	}
}
class afhda extends skhajhcj
{
	
	afhda(String name)
	{
		super(25);
		System.out.println(name);
		System.out.println("its secondd");
	}
	
}
class jhdsj extends afhda
{
	jhdsj(int b, String song)
	{
		super("suj");
		System.out.println("kjsd");
		System.out.println(b+" "+song);
		
	}
	public static void main(String[] args) {
		new jhdsj(255,"assdjas");
	}
}
