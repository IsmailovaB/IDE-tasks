package ClassesObjects;

public class BAccountTest {
    public static void main(String[] args) {
        BankAccount check = new BankAccount();

        check.type = "Chase";
        check.accountNumber = 1234567764;
        check.balance = 50;
        check.holderName = "John Miller";

//        System.out.println(check.balance);
        check.info();
        check.deposit(450.45);
//        System.out.println(check.balance);
        check.info();
        check.transfer(605.56);

        check.info();
    }
}
