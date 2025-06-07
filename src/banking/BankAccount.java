package banking;

/**
 * Represents a checking/savings bank account for a customer.
 * @author Max
 */
public class BankAccount {
	
	//instance variables
	
	/**
	 * Type of account (checking or savings)
	 */
	String accountType;
	
	/**
	 * Balance for bank account.
	 */
	double balance;
	
	/**
	 * Customer for this account.
	 */
	Customer customer;
	
	//constructor
	
	/** Creates a bank account of given type for given customer
	 * @param accountType - type of bank account
	 * @param customer - customer/owner of bank account
	 */
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	//methods
	
	/**
	 * Deposits given amount to the account balance.
	 * @param amount - amount to be added to account balance
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	/**
	 * Withdraws given amount from the account balance.
	 * @param amount - amount to be subtracted from account balance
	 * @throws Exception if given amount is larger than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Error! Amount " + amount + " is greater than available balance.\n");
		}
		this.balance -= amount;
	}
	
	/**
	 * Returns account type and balance for this bank account.
	 * @return String with account info as <accountType>:<balance>
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	/**
	 * Returns the account type as "Checking" or "Savings"
	 * @return String - account type
	 */
	public String getAccountType() {
		return this.accountType;
	}
	
	/**
	 * Returns the customer name and address for this bank account.
	 * @return String with customer name and address
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
	
}






















