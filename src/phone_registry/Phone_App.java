package phone_registry;
import java.util.Scanner;

/**
 * The main app java file that provides input access to the user
 * 
 * @author Nathan Young
 */

public class Phone_App {

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
	
	public static boolean userSession() {
      System.out.println("1. Show all devices");
      System.out.println("2. Add a device");
      System.out.println("3. Find a device");
      System.out.println("4. Delete a device");
      System.out.println("5. Number of devices");
      System.out.println("6. Exit");
      
      // Start getting input
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your selection:");
      String user_input = scanner.nextLine();
      scanner.close();
      
      // Use local function to see if string input is an integer
      if (isInteger(user_input)) {
    	  switch (user_input) {
          case "1":
        	  System.out.println("Selected option 1");
        	  
        	  // Code goes here
        	  
        	  return true;
          case "2":
        	  System.out.println("Selected option 2");
        	  
        	  // Code goes here
        	  Phone add_phone = new Phone();
        	  
        	  
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
	public static String inputManufacturer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the manufacturer name? ( Iphone / Samsung / Google ): ");
        String user_input = scanner.nextLine();
        scanner.close();
        return user_input;
	}
	/**
	 * @return user_input The screen type identifier from the user
	 */
	public static String inputScreenType() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the screen type? ( LCD / OLED / AMOLED ) ");
        String user_input = scanner.nextLine();
        scanner.close();
        return user_input;
	}
	/**
	 * @return user_input The storage space identifier from the user
	 */
	public static int inputStorageSpace() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the storage space in GB that the phone can hold? ( 128 / 256 / 512 ): ");
        String user_input = scanner.nextLine();
        scanner.close();
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
	public static boolean isInteger(String s) {
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
}
