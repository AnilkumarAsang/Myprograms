package demo.programs.demo;
import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		char ch[]=s.toCharArray();
		int countvowels=0,countconsonants=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				countvowels++;
			}
			else
			{
				countconsonants++;
			}
		}
		System.out.println("VowelCount "+countvowels);
		System.out.println("ConsonantCount "+countconsonants);
	}

}
