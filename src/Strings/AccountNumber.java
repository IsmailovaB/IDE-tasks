package Strings;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String num = scan.nextLine();
//        String firstNumber = num.substring(0,1);
//        String secondNumber = num.substring(0,1);
//        int length = num.length();
//        boolean invalid = !firstNumber.equals("5") || !firstNumber.equals("2") && !(num.length()==5);
//
//
//         if (firstNumber.equals("2")&& num.length()==7){
//             System.out.println("Valid 7 account");
//         }
//         if (firstNumber.equals("5")&& num.length()==10){
//             System.out.println("Valid 10 account");
//            }
//         else if(invalid){
//             System.out.println("Invalid account number");
             if ( num.charAt(0)=='2'){
                 if(num.length()==7){
                     System.out.println("Valid 2 account");
                 }else{
                     System.out.println("invalid 2 account");
                 }
             }else if(num.charAt(0)=='5'){
                   if(num.length()==10){
                       System.out.println("Valid 5 account");
                   }else{
                       System.out.println("invalid 5 account");
                   }
             }else {
                 System.out.println("Invalid account number");
             }


         }
    }
