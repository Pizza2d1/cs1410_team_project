package phone_registry;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/**
 * The main app java file that provides input access to the user
 * 
 * @author Nathan Young
 */

public class Phone_App {
	
	// user_input is just a placeholder variable for where user input is taken and then read
	public static String user_input;
	// Scanner takes in user input from the terminal, can detect whether a string, double, or integer was inputed
	public static Scanner scanner = new Scanner(System.in);
	// Gets the Phone.java object, named phone register because you add, delete, and read from the register as: phone_register.add()
	Phone phone_register = new Phone();
	// Make the initial arrays that puts in the information for testing
    public static ArrayList<String> initial_phone_manufacturers;
    public static ArrayList<String> initial_phone_screens;
    public static ArrayList<String> initial_phone_storages;
    public static HashMap<Integer, ArrayList<String>> phone_dictionary;

	
	public static void main(String[] args) {	

		System.out.println("Hello user\n");
		while (true) {
			if (userSession() == false) {
				break;
			} else {
				continue;
			}
		}
		scanner.close(); // Not necessary, just careful
	}
	
	public static void addTestingPhones() {
    String[] initial_phone_manufacturers = {"Apple", "Samsung", "Google"};
    String[] initial_phone_screens = {"OLED", "LCD", "AMOLED"};
    String[] initial_phone_storages = {"128", "256", "512"};

    for (int i = 0; i < 3; i++) {
      phone_register.addPhone(initial_phone_manufacturers[i], initial_phone_screens[i], initial_phone_storages[i]);
    }
	}
	
	/**
	 * 
	 * @return Checks to see if the user wants to continue using the registry, whether to add, find, or delete a device from the list
	 */
	public static boolean userSession() {
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
        	  
        	  System.out.println(phone_register.listDevices());
        	  
        	  return true;
          case "2":
        	  System.out.println("Selected option 2");

        	  String manufacturer_user_input = getUserInput("What is the phone's manufacturer?: ");
        	  String screen_user_input = getUserInput("What is the phone's screen type?: ");
        	  String storage_user_input = getUserInput("What is the phone's storage?: ");
        	  
        	  phone_register.addPhone(manufacturer_user_input, screen_user_input, storage_user_input);
        	  
        	  return true;
          case "3":
        	  System.out.println("Selected option 3");
        	  
        	  String phone_id = getUserInput("Id of the phone: ");
        	  phone_register.getPhoneId(phone_id);
        	  
        	  return true;
          case "4":
        	  System.out.println("Selected option 4");
        	  
        	  String user_input = getUserInput("What phone would you like to remove? ID: ");
            if (isInteger(user_input)) {
              phone_register.delete(user_input);
            }
        	  
        	  return true;
          case "5":
        	  System.out.println("Selected option 5");
        	  
        	  System.out.println(phone_register.getCount());
        	  
        	  return true;
          case "6":
        	  System.out.println("Selected option 6\n\nExited the program");
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
        user_input = getUserInput("What is the manufacturer name? e.g. Iphone / Samsung / Google: ");
        return user_input;
	}
	/**
	 * @return user_input The screen type identifier from the user
	 */
	public String inputScreenType() {
        user_input = getUserInput("What is the screen type? e.g. LCD / OLED / AMOLED: ");
        return user_input;
	}
	/**
	 * @return user_input The storage space identifier from the user
	 */
	public int inputStorageSpace() {
        user_input = getUserInput("What is the storage space in GB that the phone can hold? e.g. 128 / 256 / 512: ");

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
	
	public static String getUserInput(String question) {
	    System.out.println(question);
	    String user_input = scanner.nextLine();
	    return user_input;
	}
}
