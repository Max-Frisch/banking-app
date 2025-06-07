package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 * @author Max
 */
public class Bank {

	//create new Scanner object
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//creates a new instance of the Bank class
		Bank bank = new Bank();
		
		//calls the run method in the bank class
		bank.run();
	}
	
	/**
	 * Runs the program by initializing and managing bank accounts and customers
	 */
	public void run() {

		System.out.println("Welcome to the Banking app!");
		System.out.println("Creating a new Customer:");
		System.out.println();
		
		System.out.print("What is your Name? ");
		String customerName = scan.nextLine();
		
		System.out.println(); //blank line
		System.out.println("Welcome, " + customerName + ". Creating checkings and savings accounts..");
		
		//create a new Customer with given name
		Customer customer = new Customer(customerName);
		
		//get user address
		System.out.print("Please input your Address: ");
		String customerAddress = scan.nextLine();
		customer.setAddress(customerAddress);
		
		//create bank accounts for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		System.out.println(); //blank line	
		System.out.println("Savings and Checking accounts created for: " + savingsAccount.getCustomerInfo());
		
		//print current balances
		//get and print account info for checking and savings account
		printAccountBalances(checkingAccount, savingsAccount);
		
		//deposits
		System.out.println(); //blank line
		//into checking account
		depositMoney(checkingAccount);
		//into savings account
		depositMoney(savingsAccount);
		
		//print current balances
		//get and print account info for checking and savings account
		printAccountBalances(checkingAccount, savingsAccount);
		
		//withdrawals
		System.out.println(); //blank line	
		//from checking account
		withdrawMoney(checkingAccount);
		//from savings account
		withdrawMoney(savingsAccount);
		
		//print current balances
		//get and print account info for checking and savings account
		printAccountBalances(checkingAccount, savingsAccount);
		
		scan.close();
	}
	
	/**
	 * Attempt to withdraw prompted amount from given bank account
	 * @param account
	 */
	private void withdrawMoney(BankAccount account) {
		System.out.print("Amount (decimal) to be withdrawn from " + account.getAccountType() + " account: ");
		double amount = scan.nextDouble();
		try {
			account.withdraw(amount);
			System.out.println("Withdrawing " + amount + " successful.\n");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Deposit 
	 * @param account
	 * @hidden
	 */
	private void depositMoney(BankAccount account) {
		System.out.print("Amount (decimal) to deposit into your " + account.getAccountType() + " account: ");
		double amount = scan.nextDouble();
		account.deposit(amount);
		System.out.println(amount + " has been deposited into " + account.getAccountType() + " account.");	
	}

	/**
	 * Prints the balances of given savings and checking account
	 * @param savingsAccount
	 * @param checkingAccount
	 */
	public void printAccountBalances(BankAccount savingsAccount, BankAccount checkingAccount) {
		//get and print account info for checking and savings account
		System.out.println(); //blank line
		System.out.println("Account balance: ");
		System.out.println(savingsAccount.getAccountInfo());
		System.out.println(checkingAccount.getAccountInfo());
	}

}
