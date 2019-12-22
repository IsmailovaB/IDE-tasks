package methodOverriding;

public class BankAccountPublic {
   public double balance;
   public long accountNumber;
   public String name;

    public void info(){
        System.out.println("Balance: "+balance);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Name: "+name);
    }

    public void transfer(double amount){
        System.out.println("Transferred "+amount);
        this.balance = (balance-amount);
        this.balance -= (amount * 0.1);
    }
    public void deposit(double deposit){
        this.balance = balance+deposit;
        System.out.println("Deposit success.");
    }
}
