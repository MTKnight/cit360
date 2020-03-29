/**
 * @author Marci Godfrey
 * CIT 360: ACP
 */

package http_package;
import java.io.*;
import java.net.*;

public class MTKnightHTTP {

	    public static void main(String[] args) throws IOException {
	    	
            String inputLine = null;
            
	        try {
	            URL url = new URL("https://www.churchofjesuschrist.org");
	            HttpURLConnection m = (HttpURLConnection) url.openConnection();
	            BufferedReader k = new BufferedReader(new InputStreamReader(m.getInputStream()));
	            
	            do {
	            	System.out.println(inputLine);
	            }
	            	
	            while ((inputLine = k.readLine()) != null);
	            
	            k.close();
	            m.disconnect();
	        } 
	        
	        	catch (Exception e) {
	        		System.out.println(e);
	        }
	        
	    }
	    
}
