package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int numOfStudents = 1;
//
//        while(numOfStudents<=10){
//            System.out.println("Student "+numOfStudents);
//            numOfStudents++;
//        }
//        System.out.println("No more space, Sorry!");
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your address");
//        String address = scan.nextLine();
//        int count =0;
//        while(address.contains("il")){
//            count++;
//            System.out.println("enter your address");
//            address = scan.nextLine();
//        }
//        System.out.println(count);

        int account = 1500;
        int balance;
        int dec = 0;
        while (account > 0) {

            System.out.println("Please enter transaction amount:");
            balance = scan.nextInt();
            if (balance <= account) {
                System.out.println("item purchased");
                account -= balance;
            } else {
                System.out.println("Card Declined");
                dec++;
            }
            if (dec == 3) {
                System.out.println("card is locked");
                break;
            }
        }
        if (account == 0) ;
        System.out.println("broke");
    }
}
