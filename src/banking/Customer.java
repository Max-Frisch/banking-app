package banking;

/**
 * Represents a customer of the bank.
 * @author Max
 */
public class Customer {
	
	//instance variables
	
	/**
	 * Name of customer.
	 */
	String name;
	
	/**
	 * Address of customer.
	 */
	String address;
	
	//constructor
	
	/**
	 * Constructor of the Customer class. Creates a customer with the given name. 
	 * @param name - name of customer
	 */
	public Customer(String name) {
		//sets instance variable name to given name
		this.name = name;
	}
	
	//methods
	
	/**
	 * Sets the address of the Customer object to the given address.
	 * @param address - address of customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Returns the name of the customer.
	 * @return name - name field of customer object
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the customer's address. 
	 * @return address - the address field of the customer object
	 */
	public String getAddress() {
		return this.address;
	}
}






















