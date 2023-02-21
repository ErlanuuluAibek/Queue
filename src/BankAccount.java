public class BankAccount {
    private  int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void addBalance(int balance){
        this.balance+=balance;
    }
    public void takeMoney(int balance){
        this.balance-=balance;
    }
    @Override
    public String toString() {
        return "BankAccount " +
                " balance: " + balance ;
    }
}
