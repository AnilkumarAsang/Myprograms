package demo.programs.demo;
public class ReverseStringWithoutLoop {
	static String s="English";
	static String s1="";
	public static void main(String[] args) {
		int i=s.length()-1;
		String s2=reverse(i);
		System.out.println(s2);
		
	}
	
	static String reverse(int i1)
	{
		if(i1>=0){
		s1=s1+s.charAt(i1);
		i1--;
		reverse(i1);
		}
		return s1;
	}

}
