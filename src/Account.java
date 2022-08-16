import java.util.Objects;

/**
 * This class represents an abstract class Account, it offers all the common functions
 */
public abstract class Account implements InterfaceOfRate{
    /*
     Fields:
     this.name: String
     this.SSN: String
     this.accountNumber: int
     this.rate: double
     this.zipCode: int
     this.balance: double
    */
    private String name;
    private String SSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private int zipCode;
    static int index = 10000;

    /**
     * Construct the basic properties and initialize the abstract class Account
     * @param name the given user's name
     * @param SSN the given SSN
     * @param balance the initial balance
     * @param zipCode the given zip code
     */
    public Account(String name, String SSN, double balance, int zipCode){
        this.name = name;
        this.SSN = SSN;
        this.balance = balance;
        this.zipCode = zipCode;
    //    System.out.println("Name: " + this.name + " SSN: " + this.SSN + " Balance: $" + this.balance);
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    /**
     * set the account number
     * 1 or 2 + last two SSN + unique 5-digit number + random 3-digit number
     * @return the generated account number
     */
    public String setAccountNumber(){
        String lastTwoSsn = SSN.substring(SSN.length() - 2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSsn + uniqueID + randomNumber;
    }

    /**
     * Abstract class setRate
     */
    public abstract void setRate();

    /**
     * Method deposit
     * it will print the balance after deposit
     */
    public void deposit(double amount){
        this.balance = this.balance + amount;

    }

    /**
     * Method withdraw
     * it will print the balance after withdraw
     */
    public void withdraw(double amount){
        this.balance = this.balance - amount;
 //       System.out.println("Withdrawing $" + amount);
    }

    /**
     * Method transfer
     * it will print the balance after transfer
     */
    public void transfer(Object other, double amount){
        this.balance = this.balance - amount;
 //       System.out.println("Transferring $" + amount + "to" + toWhere);
    }

    /**
     * Method printBalance
     * @return print the current balance
     */
    public String printBalance(){
        return "Your balance is now $" + this.balance;
    }

    /**
     * Method compound
     * @return show the interest
     */
    public double compound(){
        double interest = this.balance * (rate / 100);
        this.balance = this.balance + interest;
        return interest;
//        System.out.println("Your Interest: $ " + interest)
    }

    /**
     * Method showInfo
     * show the information about checking account or savings account
     */
    public void showInfo(){
        System.out.println(
                "Name: " + this.name +
                "\nAccount Number: " + this.accountNumber +
                "\nBalance: " + this.balance +
                "\nZip Code: " + this.zipCode +
                "\nRate: " + rate + "%"
        );
    }

    /**
     * Method toString
     * @return return all the setup info
     */
    public String toString(){
        String inFo;
        inFo = this.name + " " + this.accountNumber + " " + this.balance + " " + this.zipCode + rate;
        return inFo;
    }

}
