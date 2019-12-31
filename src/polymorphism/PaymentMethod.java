package polymorphism;

public class PaymentMethod implements MobileVerifiable {

    @Override
    public boolean verify(){
        System.out.println("Please approve");
        return true;
    }
    public void charge(double amount){
        System.out.println("Amount charged: "+amount);
    }

    public void refund(double amount){
        System.out.println("Amount refunded: "+amount);
    }
}
