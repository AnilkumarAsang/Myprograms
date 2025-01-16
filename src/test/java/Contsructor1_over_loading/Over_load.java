package Contsructor1_over_loading;
//here we will use this() calling statement 
public class Over_load 
{
	Over_load(int id,String name,long m_number,double salary)
	{
		System.out.println(id+" "+name+" "+m_number+" "+salary);
	}
	Over_load(int b,String aletrnu,double landP )
	{
		this(35,"aniill",974372521,55780.00);
		System.out.println(b+" "+aletrnu+" "+landP);
	}
	Over_load(String comp,int compNUm,String compAdd)
	{
		this(45,"anil",55213.00);
		System.out.println(comp+" "+compNUm+" "+compAdd);
	}
	
	public static void main(String[] args) {
		new Over_load("sunil",988099366,"bangalore");
	}
}
