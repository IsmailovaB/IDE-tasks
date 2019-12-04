package Strings;

import java.util.Scanner;

public class CompareMethod {
    public static void main(String[] args) {
//        String word1 = "5java";
////        String word2 = "James";
////        String word3 = "5Java";
////        String word4 = "5Java";
//////                                  numbers come first(from less to more),and Uppercase comes first
////
////        System.out.println(word1.compareTo(word2));
////        System.out.println(word3.compareTo(word1));
////        System.out.println(word3.compareTo(word4));
////        System.out.println(word1.compareTo(word3));

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        if (num.startsWith("2")) {
            if (num.length() == 7) {
                System.out.println("Valid 2 number");
            } else {
                System.out.println("invalid 2 number");
            }
        } else if (num.startsWith("5")) {
            if (num.length() == 10) {
                System.out.println("Valid 5 number");
            } else {
                System.out.println("Invalid 5 number");
            }
        } else {
            System.out.println("Invalid account number");
        }

    }
}
