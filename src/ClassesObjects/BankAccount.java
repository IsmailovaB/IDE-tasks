package ClassesObjects;

public class BankAccount {
    String type;
    long accountNumber;
    double balance;
    String holderName;

    public void deposit(double d){
        System.out.println(d+ " is deposited to your account.");
        balance+=d;
    }
    public void transfer(double d2){
        if(balance>=d2) {
            System.out.println(d2+ " $ is transferred from your account.");
            balance -= d2;
        }
        else{
            System.out.println("There is no enough money to transfer");
        }
    }

    public void  info(){
        System.out.println("\nName: "+ holderName);
        System.out.println("Balance: "+ balance);
        System.out.println("Type: "+ type);
        System.out.println("Account Number: "+ accountNumber);
    }

}
