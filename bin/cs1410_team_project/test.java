package Phone_registry;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 0;
		ArrayList<Phone> phoneList = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		
		for (int i = 0; i < 2; ++i ) {
		
		System.out.println("Enter manufacturer: ");
		String manuInput = scnr.next();
		
		System.out.println(" enter screen type: ");
		String screenInput = scnr.next();
		
		System.out.println("enter Storage space: ");
		int userStorage = scnr.nextInt();
		
		
		Phone newPhone = new Phone (manuInput,  screenInput, userStorage, id);
		
		phoneList.add(newPhone);
		}
		
		System.out.println(phoneList);
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
		
		
		

	}

}
