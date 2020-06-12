/* Student Name: <Tatiana Flores>, Lab Section: <16160 #> */
package assignment1;
import java.util.Scanner; 
import java.lang.*;
import java.io.*; 
import java.util.*; // for ArrayList

public class Problem2 {

	public static void main(String[] args) {
			     
	      String test ="The wicked wizard`s wily wraith garnishes his master`s pasta with garlic.";
	      String[] result =problem2(test);
	      for (String x : result) { 
	            System.out.println(x); }
	}

	public static String[] problem2(String s) {
		
		if (s.length()<0 || s.length()>1000000) {
			System.out.println("Bad input, string length is out of boundaries"); // constraints test
			return null;
		}
		ArrayList<String> arrlis = new ArrayList<String>(); // ArrayList because we don't know in advance array size		
		String[] arr = s.split(" ");  
		//String[] arr = s.split("\\W+"); //to remove all punctuations
		for ( String ss : arr) {   // going through the array of strings
			int Sum =0;
			char[] ssArray = ss.toCharArray(); // convert string to array of characters
		    for(int i=0; i<ssArray.length; i++) {
		    	if(Character.isLetter(ss.charAt(i))) {   // if character is a letter -> add numeric value to the sum
		    		Sum =Sum + (Character.getNumericValue(ss.charAt(i))-9); // since letter 'a' and 'A' have 10 numeric value
		    		                                                        // substract 9 to get required 1 numeric value
		    	}
		    }
		    if (Sum ==100) {
		    //	System.out.println(ss);
		    	arrlis.add(ss); //adding to ArrayList
		    	}
		} 
		    String[] result1 = new String[arrlis.size()]; 
	        result1 = arrlis.toArray(result1); // conversion ArrayList to Array of Strings 
	        return result1;
	}
}
