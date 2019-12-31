package polymorphism;

public class PayPal extends PaymentMethod {

    @Override
    public void charge(double amount) {
        System.out.println("Amount charged from Paypal: "+amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunded to Paypal: "+amount);    }
}
