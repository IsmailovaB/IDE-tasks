package exception;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phone {

    double version;
    String brand;
    int[] contacts;


    public static void main(String[] args) {
//        Phone phone = new Phone();
//
        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Enter the phone version");
//            phone.version = scanner.nextDouble();
//            scanner.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid version entered");
//        }
//            scanner.nextLine();
//            System.out.println("Enter the brand");
//            phone.brand = scanner.nextLine();
//
//
//        try {
//            System.out.println("How many numbers do you want to enter");
//            phone.contacts = new int[scanner.nextInt()];
//            scanner.nextInt();
//            for (int i = 0; i < phone.contacts.length; i++) {
//                try {
//                    System.out.println("Enter contact number:" + (i + 1));
//                    phone.contacts[i] = scanner.nextInt();
//                } catch (InputMismatchException e) {
//                    System.out.println("Invalid number, try again");
//                    break;
//                }
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Entered incorrect number");
//            System.out.println(e.toString());
//
//        }
//
//        System.out.println("Version : " + phone.version);
//        System.out.println("Brand : " + phone.brand);
//        System.out.println("Contact numbers: " + Arrays.toString(phone.contacts));


        try {

            System.out.println("Enter number");
             int num = scanner.nextInt();
            System.out.println("Enter num");
            double n = scanner.nextDouble();
            System.out.println(num+" / "+n+" = "+(num/n));
        }catch (InputMismatchException e){
            System.out.println("One of the number was invalid");
        }catch (ArithmeticException e){
            System.out.println("Can not divide by 0");
        }
    }
}






