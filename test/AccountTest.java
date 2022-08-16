/**
 * This class contains all the unit tests for various kinds of Checking and Savings
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    Checking checkingAcc1, checkingAcc2, checkingAcc3;
    Savings savingsAcc1, savingsAcc2, savingsAcc3;

    /**
     * create objects of Checking and Savings
     */
    @Before
    public void setup(){
        checkingAcc1 = new Checking("James Smith", "123456789", 1000, 95014);
        checkingAcc2 = new Checking("Kyle Herman", "231456170", 1100, 95011);
        checkingAcc3 = new Checking("Justin Bubble", "100299170", 700, 95221);
        savingsAcc1 = new Savings("Crystal Rich", "176000178", 900, 90108);
        savingsAcc2 = new Savings("Courtney Shea", "776227778", 500, 95008);
        savingsAcc3 = new Savings("Casey Green", "303490011", 300, 95014);
    }


    /**
     * Tests the rate for corresponding checking account and savings account
     */
    @Test
    public void testRate(){
        assertEquals(0.375, checkingAcc1.getRate(), 0.001);
        assertEquals(0.375, checkingAcc2.getRate(), 0.001);
        assertEquals(0.375, checkingAcc3.getRate(), 0.001);
        assertEquals(2.30, savingsAcc1.getRate(), 0.001);
        assertEquals(2.30, savingsAcc2.getRate(), 0.001);
        assertEquals(2.30, savingsAcc3.getRate(), 0.001);
    }

    /**
     * Tests the balance of the specific accounts
     * after certain operations, check the balance of the corresponding accounts
     */
    @Test
    public void testBalance(){
        checkingAcc1.deposit(100);
        checkingAcc1.withdraw(20);
        checkingAcc2.deposit(1000);
        checkingAcc2.withdraw(55);
        checkingAcc3.deposit(2301);
        checkingAcc3.withdraw(1207);
        checkingAcc1.transfer(checkingAcc2, 32);
        checkingAcc1.transfer(checkingAcc3, 15);
        checkingAcc2.transfer(checkingAcc3, 22);
        checkingAcc2.transfer(checkingAcc1, 10);
        checkingAcc3.transfer(checkingAcc2, 29);
        checkingAcc3.transfer(checkingAcc1, 800);

        assertEquals("Your balance is now $1033.0", checkingAcc1.printBalance());
        assertEquals("Your balance is now $2013.0", checkingAcc2.printBalance());
        assertEquals("Your balance is now $965.0", checkingAcc3.printBalance());
        assertEquals(3.87375, checkingAcc1.compound(), 0.001);
        assertEquals(7.54875, checkingAcc2.compound(), 0.001);
        assertEquals(3.61875, checkingAcc3.compound(), 0.001);
    }

}
