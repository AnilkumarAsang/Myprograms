package pageObects;

 class NonStaticMultiplecopy {
 int incVar=0;
 
 void incMethod() {
	 incVar++;
 }
 
}
 class Mainclasstwo{
	 public static void main(String[] args) {
		NonStaticMultiplecopy obj1 = new NonStaticMultiplecopy();
		obj1.incMethod();
		obj1.incMethod();
		System.out.println("Print: " + obj1.incVar);
		NonStaticMultiplecopy obj2 = new NonStaticMultiplecopy();
		obj2.incMethod();
		System.out.println("Print: " + obj2.incVar);
	}
 }
