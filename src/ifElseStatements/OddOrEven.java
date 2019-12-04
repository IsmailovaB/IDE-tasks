package ifElseStatements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

//        5. Write a program that finds if the entered number is odd or even. Simply ask user to enter one integer value and
//    print “odd” or “even” based on the value user enters
        System.out.println("Write 5 integer number");
        int num = scan.nextInt();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int evens = 0;
        int odds = 0;

        if(num%2==0){
            evens++;
        }
        else{
            odds++;
        }
        if(num1%2==0){
            evens++;
        }
        else{
            odds++;
        }
        if(num2%2==0){
            evens++;
        }
        else{
            odds++;
        }
        if(num3%2==0){
            evens++;
        }
        else{
            odds++;
        }
        if(num4%2==0){
            evens++;
        }
        else{
            odds++;
        }

        System.out.println("Evens: "+ evens);
        System.out.println("Odds: " + odds);
    }
}
