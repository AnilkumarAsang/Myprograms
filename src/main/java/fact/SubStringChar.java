package fact;

public class SubStringChar {
	// import java.util.Scanner;
	// import java.util.Scanner;

	    public static void main(String[] args) {
	    String input="ani@##3344 ghg%6";
	    
	    StringBuilder alpha=new StringBuilder();
	    StringBuilder mumber=  new StringBuilder();
	    StringBuilder Special=new StringBuilder();
	    
	    for(char eachChar:input.toCharArray()){
	        if(Character.isLetter(eachChar)){
	            alpha.append(eachChar);
	        }else if(Character.isLetter(eachChar)){
	            mumber.append(eachChar);
	            
	        }else{
	            Special.append(eachChar);
	        }
	        }
	        System.out.println("Alpha: " +  alpha);
	         System.out.println("mumber: " +  mumber);
	          System.out.println("Special: " +  Special);
	        alpha.reverse();
	        System.out.println(alpha);
	        alpha.replace(0,1,"d");
	        System.out.println(alpha);
	        // String alphaSubstring = alpha.substring(0, Math.min(4, alpha.length())); // Safe substring
	        // System.out.println("Substring (first 4 chars): " + alphaSubstring);
	        String result = alpha.substring(0, 4);
	System.out.println(result); // O
	String alphaSubstring=alpha.substring(0, Math.min(3,alpha.length()));
	 System.out.println("Substring (first 4 chars): " + alphaSubstring);
	    }
	       }
	    
	    

