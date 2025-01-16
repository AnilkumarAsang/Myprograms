package ReverseStringUsingDiffConcept;

public class StringReverse {

	public static void main(String[] args) {
		String rev="Anil Kumar";
		String finalRev="";
	String[]twoPart=rev.split(" ");
		for(String singleWord:twoPart) {
			
			String emptyStore="";
			for(int i=singleWord.length()-1;i>=0;i--) {
				emptyStore +=singleWord.charAt(i);
			}
			finalRev+=emptyStore + " ";
		}
		System.out.println("reverse: " + finalRev.trim());
	}
}
