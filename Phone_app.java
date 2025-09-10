package Phone_registry;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/**
 * The main app java file that provides input access to the user
 * 
 * @author Nathan Young
 */

public class Phone_app {
	
	// user_input is just a placeholder variable for where user input is taken and then read
	
	// Scanner takes in user input from the terminal, can detect whether a string, double, or integer was inputed
	public static Scanner scnr = new Scanner(System.in);
	// Gets the Phone.java object, named phone register because you add, delete, and read from the register as: phone_register.add()
	//Phone phone_register = new Phone();
	// Make the initial arrays that puts in the information for testing
	
	public static void main(String[] args) {	
		
		System.out.println("Hello user\n");
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
	public static ArrayList<Phone> phoneList = new ArrayList<>();
	public static boolean userSession() {
		
		System.out.println();
		System.out.println("1. Show all devices");
      System.out.println("2. Add a device");
      System.out.println("3. Find a device");
      System.out.println("4. Delete a device");
      System.out.println("5. Number of devices");
      System.out.println("6. Exit");
      
      // Start getting input
      System.out.println("Enter your selection:");
  
     
      
      
      // Use local function to see if string input is an integer
      int user_input = scnr.nextInt();
    	  switch (user_input) {
          case 1:
        	  System.out.println("Entered option 1");
        	  System.out.println();
        	  for (int i = 0; i < phoneList.size(); ++i ) {
        		  System.out.println(phoneList.get(i));
        	  }
        	  
        	  
        	  return true;
          case 2:
        	  System.out.println("Selected option 2");
        	  System.out.println(2);
        	  int id = 0;
        	 
        	   System.out.println("Enter manufacturer: ");
        	   String manuInput = scnr.next();
        	   
        	   System.out.println("Enter screen type: ");
       		String screenInput = scnr.next();
       		
       		System.out.println("Enter Storage space: ");
       		int userStorage = scnr.nextInt();
       		
       		
       		Phone newPhone = new Phone (manuInput,  screenInput, userStorage, id);
       		phoneList.add(newPhone);
        	  return true;
          case 3:
        	  System.out.println("Selected option 3");
        	  System.out.println();
        	  System.out.println("enter id");
        	  int userId = scnr.nextInt();
        	  for (int i = 0; i < phoneList.size(); ++i ) {
      			Phone p = phoneList.get(i);
      				if (userId == p.getId()) {
      					System.out.println(phoneList.get(i));
      					break;
      				} else {
      					
      				}
      		}
        	  return true;
          case 4:
        	  System.out.println("Selected option 4");
        	  System.out.println();
        	  
        	  System.out.println("What phone would you like to remove? ID: ");
        	  int userId1 = scnr.nextInt();
        	  
        	  for (int i = 0; i < phoneList.size(); ++i ) {
      			Phone p = phoneList.get(i);
      				if (userId1 == p.getId()) {
      					phoneList.remove(i);
      					break;
      				} else {
      					
      				}
      		}
            
        	  
        	  return true;
          case 5:
        	  System.out.println("Selected option 5");
        	  
        	  
        	  for (int i = 0; i < phoneList.size(); ++i ) {
        			 phoneList.get(i);
        	  }
        	  
        	  return true;
          case 6:
        	  System.out.println("Selected option 6\n\nExited the program");
        	  return false;
          default:
        	  return false;
          }
      
      //return true;

	}
      
	
}