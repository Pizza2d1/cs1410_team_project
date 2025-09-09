package cs1410_team_project;
/**
 * A class that contains the attributes of the phone objects and returns them to the user interface.
 * 
 * @author Jasey Christensen
 */
public class Phone {
	private String Manufacturer;
	private String ScreenType;
	private int StorageSpace;
	private final int id;
	private static int nextId = 1;
	/**
	 * Constructor to initialize fields
	 * 
	 * @param manufacturer the phones manufacturer ex: apple, samsung
	 * @param screenType The type of screen the phone has
	 * @param storageSpace How much storage the phone has
	 * @param id unique id for the phone object
	 */
	public Phone(String manufacturer, String screenType, int storageSpace, int id) {
		this.Manufacturer = manufacturer;
		this.ScreenType = screenType;
		this.StorageSpace = storageSpace;
		this.id = 1234567 + nextId++;
	}
	/**
	 * Returns the phones manufacturer
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return Manufacturer;
	}
	/**
	 * Returns the phones screen type
	 * @return the screenType
	 */
	public String getScreenType() {
		return ScreenType;
	}
	/**
	 * Returns the phones storage space
	 * @return the storageSpace
	 */
	public int getStorageSpace() {
		return StorageSpace;
	}
	/**
	 * Returns the phone objects id
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	 /**
	  * Provides the parameters information in a String format
	  */
	@Override
	    public String toString() {
		 return " Phone type:" + Manufacturer +
				 ", Screen type:" + ScreenType + 
				 ", Storage space:" + StorageSpace +
				 ", ID number:" + id;
	 }
	
	
	
	
}
