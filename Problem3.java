/* Student Name: <Tatiana Flores>, Lab Section: <16160 #> */
package assignment1;

import static assignment1.Problem3.problem3;
import java.io.IOException;
import java.util.*; 
import java.lang.Object;
import edu.stanford.nlp.tagger.maxent.MaxentTagger; // library 

public class Problem3 {

	public static void main(String[] args) throws IOException,
	   ClassNotFoundException {
		String sample1 ="I was slowly walking to the park with my over enthusiastic dog when he bit me, and I shouted, Ouch!";
		String result =problem3(sample1);		
	}
	
	public static String problem3(String x) {
		// folder taggers contains two files .tagger and .tagger.props //
		MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger"); //format "FOLDER_NAME/FILE_NAME"
		String tagged = tagger.tagString(x);
		//StringBuilder sb = new StringBuilder(tagged); // tagger adds extra space at the end of the string
		                                           // StringBuilder is used to remove this and convert it back to the string 
		//sb.deleteCharAt(sb.length() - 1);             		
		//return sb.toString();
		tagged =tagged.trim(); // another method using .trim() for the same purpose
		return tagged;
	}
}