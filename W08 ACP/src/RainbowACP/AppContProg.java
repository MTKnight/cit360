/**
 * @author Marci Godfrey
 * CIT 360: ACP
 */

package RainbowACP;
import java.util.*;

public class AppContProg {
	
    public static void main(String[] args) {
        RainbowACP rainbow = new RainbowACP();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        String question = "Would you like to see the colors of the rainbow?\n"
           + "OR \n" 
           + "Would you like to see different types of clouds?\n"
           + " Enter 1 for Colors.\n"
           + " Enter 2 for Clouds.\n";
        
        
        // Get user input
        System.out.printf("%s", question);
        do {
            input = scanner.nextInt();
            
            if ((input != 1) && (input != 2)) {
                System.out.printf("Invalid entry (%d).  Try again.\n", input);   
            }
            
        }
        while((input != 1) && (input != 2));
        
        if (input == 1){
        	rainbow.invokeHandler("Colors");
        }
        
        if (input == 2){
        	rainbow.invokeHandler("Clouds");
        }
        
        scanner.close();
        System.out.println("\nThank you.");
    }

}
