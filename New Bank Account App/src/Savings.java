/**
 * This class represents
 */
public class Savings extends Account{
    /*
     Fields:
     this.safetyDepositBoxId: int
     this.safetyDepositBoxKey: int
    */

    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    /**
     * Construct a Savings object using the given name
     * @param name the user's name of the savings account
     * @param SSN the given SSN
     * @param balance the initial balance
     * @param zipCode the given zip code
     */
    public Savings(String name, String SSN, double balance, int zipCode){
        super(name, SSN, balance, zipCode);
        accountNumber = "1" + accountNumber;
        this.safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    /**
     * override Method setRate
     * get the rate of savings account
     */
    @Override
    public void setRate(){
        rate = getBaseRate() - 0.20;
    }

    /**
     * add specific info
     * underneath the showInfo method of the parent Account
     */
    @Override
    public void showInfo(){
        System.out.println("Account Type: CHECKING");
        super.showInfo();
        System.out.println(
                "Your Savings Account Feature" +
                "\nSafety Deposit Box ID: " + this.safetyDepositBoxId +
                "\nSafety Deposit Box Key: " + this.safetyDepositBoxKey
        );

    }





}
