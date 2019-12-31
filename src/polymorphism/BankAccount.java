package polymorphism;

public class BankAccount extends PaymentMethod {

    @Override
    public void charge(double amount) {
        System.out.println("Amount charging from Bank Account: "+amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunded to Bank Account: "+amount);    }
}
