package Contsructor1_over_loading;

public class const2 {  
		//instance variables of the class  
		int id;
		int passoutYear;  
		String name;
		String contactNo;
		String collegeName;  
		  
		const2(String contactNo, String collegeName, int passoutYear){ 
			//System.out.println(i+" "+collegeName+" "+passoutYear);
		this.contactNo = contactNo;  
		this.collegeName = collegeName;  
		this.passoutYear = passoutYear;  
		System.out.println(contactNo+""+collegeName+" "+passoutYear );
		}  
		  
		const2(int id, String name){ 
			/*this(988099,"achar",2016);
			System.out.println(id+" "+name);*/
		this("9743725210", " AIT bangalore", 2018);  
		this.id = id;  
		this.name = name;  
		System.out.println(id+" "+name);
		}  
		  
		public static void main(String[] args) {  
		//object creation  
		const2 s = new const2(101, "Anil");  
		
		System.out.println("Printing Student Information: \n");  
		/*System.out.println("Name: "+s.name+"\nId: "+s.id+"\ncollegeName.: "
				+ ""+s.collegeName+"\nContact No: "+s.contactNo+"\nPassing Year: "
						+ ""+s.passoutYear);*/
}}
