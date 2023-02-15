public class BankAccount implements Comparable<BankAccount> {
    int accountNo;
    String holderName;
    double balance;

    public BankAccount(int accountNo,String holderName, double balance){
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double balanceChange(double amount){

        return balance - amount;
    }

    @Override
    public int compareTo(BankAccount b) {

        return holderName.compareTo(b.holderName);
    }

}
