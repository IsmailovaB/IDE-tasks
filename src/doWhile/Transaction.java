package doWhile;

import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 1500;
        int transaction = 0;

        do{
            System.out.println("Enter your trans item;");
            transaction = scan.nextInt();
            balance-=transaction;
        }while(balance>=0);
        System.out.println("you are broke");
    }
}
