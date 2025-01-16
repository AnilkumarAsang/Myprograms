package string_function;

public class splitfunctionreversegivensentence {
	public static void main(String[] args) {
		String str1="i have studied in acharya college";
		String[] str2=str1.split(" ");
		for(int i=str2.length-1;i>=0;i--)
		{


			System.out.print(str2[i]+" ");


		}
	}
}
