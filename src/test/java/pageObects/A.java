package pageObects;

public class A {    //Single level inheritence
	void cat() {
		System.out.println("Cat sound meow meow");
	}
}

class B extends A{
	void dog() {
		System.out.println("Dog bark");
		
	}
}

class M {
	public static void main(String[] args) {
		B obj = new B();
		obj.cat();
		obj.dog();
	}
}
