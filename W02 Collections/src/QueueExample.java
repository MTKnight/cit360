import java.util.*;

/**
 * @author Marci Godfrey
 * CIT 360: Collections Examples: Queue
 */

public class QueueExample {

	public static void main(String[] args) {
		
		// Declare
		Queue<String> myKids = new LinkedList<String>();
	    
	    //Adding elements to the Queue
	    myKids.add("Briella");
	    myKids.add("Emmaline"); 
	    myKids.add("Claire");
	    myKids.add("Adalie");
		
	    //Complete Queue
	    System.out.println("Elements in Queue:"+myKids);

	    //Remove Top
	    System.out.println("Removed element: "+myKids.remove());
    
	    //Remaining Queue
	    System.out.println("Elements in Queue:"+myKids);

	}

}