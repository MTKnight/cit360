/**
 * @author Marci Godfrey
 * CIT 360: ACP
 */

package RainbowACP;
import java.util.HashMap;

public class RainbowACP {
	HashMap<String, Handler> controlOptions;
	    
	public RainbowACP() {
	        controlOptions = new HashMap<>();
	        controlOptions.put("Colors", new ColorHandler());
	        controlOptions.put("Clouds", new CloudHandler());
	    }
	    
	public Object invokeHandler(String string){
	        Handler invoker = controlOptions.get(string);
	        return invoker.handleIt();
	    }
}
