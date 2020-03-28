/**
 * @author Marci Godfrey
 * CIT 360: ACP
 */

package RainbowACP;
import java.util.ArrayList;

public class ColorHandler implements Handler{

	    @Override
	    public Object handleIt(){
	    	
	        ArrayList<String> Colors = new ArrayList<String>();
	        
	        Colors.add("Red");
	        Colors.add("Orange");
	        Colors.add("Yellow");
	        Colors.add("Green"); 
	        Colors.add("Blue"); 
	        Colors.add("Indigo"); 
	        Colors.add("Violet"); 

	        for(String type : Colors) {
	            System.out.printf("%s \n", type);
	        } 
	        
	        return null;
	    }
}

