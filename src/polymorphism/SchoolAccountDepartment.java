package polymorphism;

import java.util.ArrayList;

public class SchoolAccountDepartment {

    public static void main(String[] args) {


        PaymentMethod pM1 = new BankAccount();
        PaymentMethod pM2 = new CreditCard();
        PaymentMethod pM3 = new PayPal();
        PaymentMethod pM4 = new PayPal();
        PaymentMethod pM5 = new BankAccount();

        MobileVerifiable mv = new PayPal();
        mv.verify();

        ArrayList<PaymentMethod> studentPayment = new ArrayList<>();
        studentPayment.add(pM1);
        studentPayment.add(pM2);
        studentPayment.add(pM3);
        studentPayment.add(pM4);
        studentPayment.add(pM5);

        for(PaymentMethod p : studentPayment){
            p.charge(750);
        }
    }
}
