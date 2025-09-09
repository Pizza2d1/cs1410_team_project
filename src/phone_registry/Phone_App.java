package phone_registry;
import java.util.Scanner;

/**
 * The main app java file that provides input access to the user
 * 
 * @author Nathan Young
 */

public class Phone_App {
	
	public String user_input;

	public static void main(String[] args) {	
		System.out.println("Hello user");
    userSession();
    userSession();
		while (true) {
			if (userSession() == false) {
				break;
			} else {
				continue;
			}
		}
	}
	/**
	 * 
	 * @return Checks to see if the user wants to continue using the registry, whether to add, find, or delete a device from the list
	 */
	public boolean userSession() {
      System.out.println("1. Show all devices");
      System.out.println("2. Add a device");
      System.out.println("3. Find a device");
      System.out.println("4. Delete a device");
      System.out.println("5. Number of devices");
      System.out.println("6. Exit");
      
      // Start getting input
      user_input = getUserInput("Enter your selection:");
      
      // Use local function to see if string input is an integer
      if (isInteger(user_input)) {
    	  switch (user_input) {
          case "1":
        	  System.out.println("Selected option 1");
        	  
        	  // Code goes here
        	  
        	  return true;
          case "2":
        	  System.out.println("Selected option 2");
        	  
        	  //Phone add_phone = new Phone();
        	  String manufacturer_user_input = getUserInput("What is the phone's manufacturer?: ");
        	  String screen_user_input = getUserInput("What is the phone's screen type?: ");
        	  String storage_user_input = getUserInput("What is the phone's storage?: ");
        	  
        	  //add_phone.addPhone(manufacturer_user_input, screen_user_input, storage_user_input);
        	  
        	  
        	  return true;
          case "3":
        	  System.out.println("Selected option 3");
        	  
        	  // Code goes here
        	  
        	  return true;
          case "4":
        	  System.out.println("Selected option 4");
        	  
        	  // Code goes here
        	  
        	  return true;
          case "5":
        	  System.out.println("Selected option 5");
        	  
        	  // Code goes here
        	  
        	  return true;
          case "6":
        	  System.out.println("Selected option 6");
        	  return false;
          default:
        	  return false;
          }
      }
      return true;
      
      
	}
      
	/**
	 * @return user_input The manufacturer identifier from the user
	 */
	public String inputManufacturer() {
        user_input = getUserInput("What is the manufacturer name? ( Iphone / Samsung / Google ): ");
        return user_input;
	}
	/**
	 * @return user_input The screen type identifier from the user
	 */
	public String inputScreenType() {
        user_input = getUserInput("What is the screen type? ( LCD / OLED / AMOLED ) ");
        return user_input;
	}
	/**
	 * @return user_input The storage space identifier from the user
	 */
	public int inputStorageSpace() {
        user_input = getUserInput("What is the storage space in GB that the phone can hold? ( 128 / 256 / 512 ): ");

        if (isInteger(user_input)) {
        	int sanitized_user_input = Integer.parseInt(user_input);
        	return sanitized_user_input;
        } else {
        	System.out.print("Incorrect input, must only use numbers for storage");
        	return 1;
        }
	}
	/**
	 * @param s String variable that will be checked
	 * @return Value indicating whether the inputed string is a integer, not including doubles
	 */
	public boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	public String getUserInput(String question) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print(question);
	    String user_input = scanner.nextLine();
	    scanner.close();
	    return user_input;
	}
}
