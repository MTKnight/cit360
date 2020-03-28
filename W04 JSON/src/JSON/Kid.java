/**
 * @author Marci Godfrey
 * CIT 360: JSON (not the Argonaut)
 */

package JSON;


public class Kid{
	  private String name; 
	  private String gender; 
	  private boolean schoolAged; 

	  public String getName(){
	  	return name; 
	  }
	  
	  public void setName(String name){
	  	 this.name = name;
	  }
	  
	  public String getGender(){
	  	return gender; 
	  }
	  
	  public void setGender(String gender){
	  	 this.gender = gender;
	  }
	  public boolean getSchoolAged(){
	  	return schoolAged; 
	  }
	  
	  public void setSchoolAged(boolean schoolAged){
	  	 this.schoolAged = schoolAged;
	  }
	  
	  public String toString() {
		  return "Name: " + name + System.lineSeparator() + "Gender: " + gender + System.lineSeparator() + "School-Aged? " + schoolAged;
	  }
}
  