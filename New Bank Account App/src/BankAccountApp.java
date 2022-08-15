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
        String file = "/Users/yuanwang/cs5004Summer22/CS5004_WangYuan/FinalProject/NewBankAccounts.csv ";
        List<String[]> newAcountHolders = utilities.readCVS.read(file);
        for(String[] accountHolder : newAcountHolders){

            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
    }
}