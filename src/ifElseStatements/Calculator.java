package ifElseStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two double number:");
        double num = scan.nextDouble();
        double num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please choose from below options: +, -, *, /");
        String calculate = scan.nextLine();

        if (calculate.equals ("+")){
            System.out.println("Result of " + num+calculate+num1+ " is: " +(num+num1));
        }
        else if (calculate.equals ("-")){
            System.out.println("Result of " + num+ calculate +num1+ " is: " +(num-num1));
        }
        else if (calculate.equals ("*")){
            System.out.println("Result of " + num+calculate+num1+ " is: " +(num*num1));
        }
        else if (calculate.equals ("/")) {
            System.out.println("Result of " + num + calculate + num1 + " is: " + (num / num1));

        }
        else {
            System.out.println("Invalid operator, Please try again");
        }
        }

    }

