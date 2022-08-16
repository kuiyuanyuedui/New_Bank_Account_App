/**
 * This class represents a checking account.
 * It offers all the operations mandated by the InterfaceOfRate interface
 */
public class Checking extends Account{
    /*
     Fields:
     this.debitCardNumber: int
     this.debitCardPin: int
    */

    private int debitCardNumber;
    private int debitCardPin;

    /**
     * Construct a Checking object using the given name
     * @param name the user's name of the checking account
     * @param SSN the given SSN
     * @param balance the initial balance
     * @param zipCode the given zip code
     */
    public Checking(String name, String SSN, double balance, int zipCode){
        super(name, SSN, balance, zipCode);
        accountNumber = "2" + accountNumber;
        this.debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    /**
     * get the debit card number
     */
    public int getDebitCardNumber(){
        return this.debitCardNumber;
    }

    /**
     * get the debit card pin
     */
    public int getDebitCardPin(){
        return this.debitCardPin;
    }

    /**
     * override Method setRate
     * get the rate of checking account
     */
    @Override
    public void setRate(){
        rate = getBaseRate() * 0.15;
//        System.out.println("");
    }

    /**
     * @return get rate of checking account
     */
    public double getRate(){
        return rate;
    }
    /**
     * add the specific info of Checking account
     * underneath the showInfo method of the parent Account
     */
    @Override
    public void showInfo(){
        System.out.println("Account Type: CHECKING");
        super.showInfo();
        System.out.println(
                "Your Checking Account Feature" +
                        "\nYour Debit Card Number is : " + getDebitCardNumber() +
                        "\nYour Debit Card Pin is: " + getDebitCardPin()
        );
    }

    /**
     * Method toString
     * @return return all the setup info
     */
   @Override
    public String toString(){
       return super.toString() + " " + getDebitCardNumber() + getDebitCardPin();
    }

}
