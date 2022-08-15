import java.util.LinkedList;
import java.util.List;

/**
 * This class represents
 */
public class BankAccountApp {
    public static void main(String[] args) {
   /*   System.out.println();
        Checking checkingAcc1 = new Checking("James Smith", "231456178", 1300, 95014);
        Savings savingsAcc1 = new Savings("Crystal Rich", "776596178", 1500, 90108);

        checkingAcc1.showInfo();
        System.out.println();
        savingsAcc1.showInfo();
    */
        List<Account> accounts = new LinkedList<Account>();

        String file = "NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.readCSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double balance = Double.parseDouble(accountHolder[3]);
            int zipCode = Integer.parseInt(accountHolder[4]);
            System.out.println(name + " " + SSN + " " + accountType + " $" + balance + zipCode);

            if(accountType.equals("Savings")){
 //               System.out.println("Open a savings account");
                accounts.add(new Savings(name, SSN, balance, zipCode));
            }else if(accountType.equals("Checking")){
 //               System.out.println("Open a checking account");
                accounts.add(new Checking(name, SSN, balance, zipCode));
            }else{
                System.out.println("Error");
            }
        }
//        accounts.get(5).showInfo();
        for (Account acc : accounts){
            System.out.println("\n*************************************************\n");
            acc.showInfo();
        }
    }
}