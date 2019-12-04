package switchRandomStatement;

import java.util.Scanner;

public class AccessToBuilding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
         int age = scan.nextInt();

        if (age<0 || age>100) {
                System.out.println("Not a valid age");
        } else if(age>=30){
            System.out.println("Welcome to the building");
        }else {
            System.out.println("Try again when you're 30");
        }
    }
}
