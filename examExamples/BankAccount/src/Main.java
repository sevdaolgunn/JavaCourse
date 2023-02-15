import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1,"abc",2000);
        BankAccount a2 = new BankAccount(2,"def",3000);
        BankAccount a3 = new BankAccount(3,"mnk",4000);
        BankAccount a4 = new BankAccount(4,"wer",5000);

        ArrayList<BankAccount> myAccounts = new ArrayList<BankAccount>();

        Collections.sort(myAccounts);

        for(BankAccount b : myAccounts){
            System.out.println(b.balanceChange(500));
            System.out.println(b.balance);
        }
        a1.balanceChange(500);
        System.out.println(a1.balance);

        Iterator iter = myAccounts.iterator();

        while(iter.hasNext()){
            BankAccount bnk = (BankAccount)iter.next();
            System.out.println(bnk.holderName);
        }

    }
}