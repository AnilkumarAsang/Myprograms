package pageObects;

public class HierarchicalInheritance {

	void car() {
		System.out.println("Car main class method");
	}
}

class Firstclass extends HierarchicalInheritance{
	void tyre() {
		System.out.println("Get the car and put the tyre");
	}
}
class Secondclass extends HierarchicalInheritance {
	void glass() {
		System.out.println("Get the car and put all the glass");
	}
}

class TargetClassForAll {
	public static void main(String[] args) {
		Firstclass first=new Firstclass();
		first.car();
		first.tyre();
		Secondclass second=new Secondclass();
		second.car();
		second.glass();
	}
}