import java.util.HashSet;

/**
 * @author Marci Godfrey
 * CIT 360: Collections Examples: Set
 */
public class SetExample {

	public static void main(String[] args) {

		// Declare
		HashSet<String> myKids = new HashSet<String>();
		
		//List Data
		myKids.add("Briella");
		myKids.add("Emmaline");
		myKids.add("Claire");
		myKids.add("Adalie");
		
		//Output
		System.out.println("The Godfrey Girls: " + myKids);
		System.exit(1); 
		
	}

}