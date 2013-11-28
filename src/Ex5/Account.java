package Ex5;

import java.text.NumberFormat;

/**
 * COMP 1510 Lab 04.
 * Clayton Burgess
 * A00889398
 * Set 1A
 */

 
/**
 * <p>A bank account class with methods to deposit to, withdraw from,
 * change the name on, charge a fee to, and print a summary of the account.</p>
 * @author Clayton Burgess A00889398 Set 1A
 * @version 1.0
 */
public class Account { 
    /**
     * <p>The service fee amount.</p>
     */
    private static final int FEE_AMOUNT = 10;
    
    /**
     * <p>Monetary balance of the account.</p>
     */
    private double balance; 
    
    /**
     * <p>Name of the account owner.</p>
     */
    private String name; 
    
    /**
     * <p>Unique account identification number.</p>
     */
    private long acctNum;  
     
    /**
     * <p>Constructor -- Initializes balance, owner, and account number.</p>
     * @param initBal initial balance of the account.
     * @param owner name of account owner.
     * @param number unique account number.
     */
    public Account(double initBal, String owner, long number) { 
        balance = initBal; 
        name = owner; 
        acctNum = number; 
    } 
    
    /**
     * <p>Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.</p>
     * @param amount amount to be withdrawn
     */
    public void withdraw(double amount) { 
        if (balance >= amount) { 
            balance -= amount; 
        } else {
            System.out.println("Insufficient funds");
        }
    }  

    /**
     * <p>Adds amount to the account balance.</p>
     * @param amount amount to be deposited.
     */
    public void deposit(double amount) { 
        balance += amount; 
    } 
 
    /**
     * <p>Returns the balance of the account.</p>
     * @return the account balance.
     */
    public double getBalance() { 
        return balance; 
    } 
 
    /**
     * <p>Returns a string detailing the owner,
     * number and balance of the account.</p>
     * 
     * @return string with account details.
     */
    public String toString() {
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        return "--Account information for " + acctNum + "--\nOwner: " 
                + name + "\nBalance: " + moneyFormat.format(getBalance());
    } 
    
 
    /**
     * <p>Deducts a service fee from the account.</p>
     * @return the resulting account balance.
     */
    public double chargeFee() { 
        balance -= FEE_AMOUNT;
        return balance;
    } 
 
    /**
     * <p>Changes the name on the account.</p>
     * @param newName the new name to be associated with the account. 
     */
    public void changeName(String newName) { 
        name = newName;
    } 
 } 
