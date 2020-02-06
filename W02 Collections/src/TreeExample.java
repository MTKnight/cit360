import java.util.TreeSet;

/**
 * @author Marci Godfrey
 * CIT 360: Collections Examples: Tree
 */
public class TreeExample {

	public static void main(String[] args) {
		
		// Declare
		TreeSet<String> myKids = new TreeSet<String>();
		
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
