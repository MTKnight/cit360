/**
 * @author Marci Godfrey
 * CIT 360: JSON (not the Argonaut)
 */

package JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;


public class JSONexample {

	public static String kidtoJSON (Kid kid) {
		ObjectMapper mapper = new ObjectMapper();
		String k = "";
		
		try {
		k = mapper.writeValueAsString(kid);
		} catch (JsonProcessingException e) {
			System.err.println(e.toString());
		}
		
		return k;

	}
	
	public static Kid JSONtoKid (String k) {
		
		ObjectMapper mapper = new ObjectMapper();
		Kid kid = null;
			
		try {
			kid = mapper.readValue (k, Kid.class);
		} catch (JsonProcessingException e) {
			System.err.println(e.toString());
		}
		
		return kid;
			
	}
	
	public static void main (String[] args) {
		Kid kid = new Kid();
		kid.setName("Briella");
		kid.setGender("FEMALE");
		kid.setSchoolAged(true);
		
		String json = JSONexample.kidtoJSON(kid);
		System.out.println(json);
		
		Kid kid2 = JSONexample.JSONtoKid(json);
		System.out.println(kid2);
	}

}
