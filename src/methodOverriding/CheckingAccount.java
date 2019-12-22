package methodOverriding;

public class CheckingAccount extends BankAccountPublic{

    @Override
    public void transfer(double transfer){
        double total = transfer + (transfer * 0.05);
        if(balance >= total){
            this.balance -= total;
        }else{
            System.out.println("Sorry, there is not enough money to transfer");
        }
    }

}
