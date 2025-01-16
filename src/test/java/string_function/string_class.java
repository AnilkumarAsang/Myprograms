package string_function;

public class string_class {
public static void main(String[] args) {
	String s1="JavaMava";
	System.out.println(s1.charAt(2)+" :it will give the value based on index number");
	System.out.println(s1.length()+" :it will print total length of the string");
	System.out.println(s1.contains("vam")+" :it will check through partial value given in string ");
	System.out.println(s1.endsWith("ava")+" :it will check end value given in string");
	System.out.println(s1.indexOf("M")+" :it will print index number based on given value");
	System.out.println(s1.replace('v', 'x')+" :it will replace with old char to new char");
	System.out.println(s1.toLowerCase()+" :it will print all char in lower case");
	System.out.println(s1.toUpperCase()+" :it will print all char in upper case");
	System.out.println(s1+" :it will orginal given value");
	
}
}
