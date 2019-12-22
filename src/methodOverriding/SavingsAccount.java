package methodOverriding;

public class SavingsAccount extends BankAccountPublic{
    public double interestIncome;

    public void transfer(double transfer){
        this.balance = (balance-transfer);
        this.balance -= transfer * 0.2;
    }

    public void calculateAnnualInterestIncome(){
        this.interestIncome += (balance * 0.03);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Interest Income: "+interestIncome);
    }

    @Override
    public String toString(){

        return "Balance: "+balance+" | "+" Account: "+accountNumber+" | "+"Name: "+name+" | "+"Interest income: "+interestIncome+".";
    }

}
