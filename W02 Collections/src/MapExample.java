import java.util.HashMap;

/**
 * @author Marci Godfrey
 * CIT 360: Collections Examples: Map
 */
public class MapExample {

	public static void main(String[] args) {
		
		// Declare
		HashMap<String, Number> myKids = new HashMap<String, Number>();
		
		//Map Data
		myKids.put("Briella", 12);
		myKids.put("Emmaline", 11);
		myKids.put("Claire", 5);
		myKids.put("Adalie", 4);
		
		//Output
		System.out.println("The Godfrey Girls and their ages: " + myKids);
		System.exit(1); 

	}

}
