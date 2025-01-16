package pageObects;

public class StaticSingleCopyExample {
	static int incVar=0;

	static void incMethod() {
		incVar++;
	}
	
}

class MainClass{
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			StaticSingleCopyExample.incMethod();
		}
		
//		StaticSingleCopyExample.incMethod();
		System.out.println("Inc: " + StaticSingleCopyExample.incVar);
	}

}
