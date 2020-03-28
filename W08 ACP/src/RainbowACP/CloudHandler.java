/**
 * @author Marci Godfrey
 * CIT 360: ACP
 */

package RainbowACP;
import java.util.ArrayList;

public class CloudHandler implements Handler{
	 @Override
	 public Object handleIt(){
	    ArrayList<String> Clouds = new ArrayList<String>();

	    	Clouds.add("Altocumulus"); 
	    	Clouds.add("Altostratus"); 
	        Clouds.add("Cirrocumulus"); 
	    	Clouds.add("Cirrus");
	        Clouds.add("Cumulus"); 
	        Clouds.add("Cumulonimbus"); 
	        Clouds.add("Nimbus");
	        Clouds.add("Stratocumulus");
	        Clouds.add("Stratus"); 

	        for(String type : Clouds) {
	            System.out.printf("%s Cloud\n", type);
	        }
	        return null;
	    }

}
