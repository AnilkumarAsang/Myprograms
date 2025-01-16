package multiple_class;

interface Interface 
{
int a=10;
void disp1();
}
interface simple
{
	void disp(); 	
}
class samplu implements Interface,simple
{
	public void disp()
	{
		System.out.println("its abstract body");
	}
	public void disp1()
	{
		System.out.println("its second abstrst ");
	}
	public static void main(String[] args) {
		samplu s=new samplu();
		s.disp();
		System.out.println(s.a);
		s.disp1();
	}
}