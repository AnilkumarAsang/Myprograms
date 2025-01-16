package pageObects;

public class MultilevelInheritence {

	
	void A() {
		System.out.println("A method");
	}
}

class Second extends MultilevelInheritence {
	void B() {
		System.out.println("Method B");
	}
}

class Third extends Second {
	void C() {
		System.out.println("Method C");
	}
}
 class Maintargetclass {
	public static void main(String []args) {
		Third third=new Third();
		third.A();
		third.B();
		third.C();
	}
}
 