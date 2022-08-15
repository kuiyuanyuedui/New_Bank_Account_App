/**
 * This class represents
 */
public abstract class Account implements InterfaceOfRate{
    /*
     Fields:
     this.name: String
     this.SSN: String
     this.accountNumber: int
     this.rate: double
     this.zipCode: int
    */
    private String name;
    private String SSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private int zipCode;
    static int index = 10000;

    /**
     * Construct the basic properties and initialize the account
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
    private String setAccountNumber(){
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
     *
     */
    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    /**
     * Method withdraw
     *
     */
    public void withdraw(double amount){
        this.balance = this.balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    /**
     * Method transfer
     *
     */
    public void transfer(String toWhere, double amount){
        this.balance = this.balance - amount;
        System.out.println("Transferring $" + amount + "to" + toWhere);
        printBalance();
    }

    /**
     * Method printBalance
     *
     */
    public void printBalance(){
        System.out.println("Your balance is now $" + this.balance);
    }

    /**
     * show the information about checking account or savings account
     */

    /**
     *
     */
    public void compound(){
        double interest = this.balance * (rate / 100);
        this.balance = this.balance + interest;
        System.out.println("Your Interest: $ " + interest);
        printBalance();
    }

    public void showInfo(){
        System.out.println(
                "Name: " + this.name +
                "\nAccount Number: " + this.accountNumber +
                "\nBalance: " + this.balance +
                "\nZip Code: " + this.zipCode +
                "\nRate: " + rate + "%"
        );
    }





}
