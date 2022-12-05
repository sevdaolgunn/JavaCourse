public class NFT {
    public double balance;
    public String owner;

    public NFT(double balance,String owner){
        this.owner = owner;
        setBalance(balance);

    }

    public void setBalance(double balance) {
        if(balance<0 || balance>1000)
            throw new IllegalArgumentException("cannot be less than 0 or greater than 1000");
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
