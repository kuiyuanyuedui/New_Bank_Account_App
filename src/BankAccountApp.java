import java.util.LinkedList;
import java.util.List;

/**
 * This class represents BankAccountApp
 */
public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        String file = "NewBankAccounts.csv";
        // read .csv file
        // create new accounts based on the data (a lists of arrays)
        List<String[]> newAccountHolders = utilities.readCSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];

            // cast string to double
            double balance = Double.parseDouble(accountHolder[3]);

            // cast string to integer
            int zipCode = Integer.parseInt(accountHolder[4]);

            System.out.println(name + " " + SSN + " " + accountType + " $" + balance + zipCode);

            // determine which account to create
            if(accountType.equals("Savings")){
                // add new savings account
                accounts.add(new Savings(name, SSN, balance, zipCode));
            }else if(accountType.equals("Checking")){
                // add new checking account
                accounts.add(new Checking(name, SSN, balance, zipCode));
            }else{
                System.out.println("Error");
            }
        }

        for (Account acc : accounts){
            System.out.println("\n*************************************************\n");
            acc.showInfo();
        }
    }
}