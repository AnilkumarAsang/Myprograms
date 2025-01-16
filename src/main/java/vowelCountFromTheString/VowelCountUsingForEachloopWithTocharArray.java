package vowelCountFromTheString;

public class VowelCountUsingForEachloopWithTocharArray {

	public static void main(String[]args) {
		
		String inputTocheckVoewls="anilkumar asangihal";
		
		String vowels="aeiou";
//		char[] fdhbfd = inputTocheckVoewls.toCharArray();
		for(char indiChar:inputTocheckVoewls.toCharArray()) {
			
			if(vowels.indexOf(indiChar) !=-1) {
				
				System.out.print(indiChar + " ");
			}
		}
	}
}
