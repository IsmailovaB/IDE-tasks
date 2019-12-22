package methodOverriding;

import ClassesObjects.BankAccount;

public class BankTest {
    public static void main(String[] args) {

        BankAccountPublic ba = new BankAccountPublic();
        ba.name = "Lukas";
        ba.balance = 3500;
        ba.accountNumber = 34525246;
        ba.info();
        ba.deposit(560);
    }
}
