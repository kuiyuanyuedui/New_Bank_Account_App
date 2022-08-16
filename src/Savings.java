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
     * get the safe deposit box ID
     */
    public int getSafetyDepositBoxId(){
        return this.safetyDepositBoxId;
    }

    /**
     * get the safe deposit box key
     */
    public int getSafetyDepositBoxKey(){
        return this.safetyDepositBoxKey;
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
     * @return get rate of savings account
     */
    public double getRate(){
        return rate;
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
                "\nSafety Deposit Box ID: " + getSafetyDepositBoxId() +
                "\nSafety Deposit Box Key: " + getSafetyDepositBoxKey()
        );
    }

    /**
     * Method toString
     * @return return all the setup info
     */
    @Override
    public String toString(){
        return super.toString() + " " + getSafetyDepositBoxId() + getSafetyDepositBoxKey();
    }



}
