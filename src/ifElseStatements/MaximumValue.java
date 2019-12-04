package ifElseStatements;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 integer number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int max = 0;

        if(num1>num2 && num1>num3){
            max = num1;
//            System.out.println("Maximum number is: " + num1);
        }

        else if(num2>num1 && num2>num3) {
            max = num2;
        }
         else if(num3>num1 && num3>num2){
            max = num3;
        }

         else if(num1==num2&&num1==num3){
            System.out.println("All numbers are equal");
        }

        System.out.println("Max number is: " +max);


        }




    }

