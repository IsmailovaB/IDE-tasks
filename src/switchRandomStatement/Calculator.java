package switchRandomStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two double number");
        double num = scan.nextDouble();
        double num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter below operator: +, -, *, /");
        String operator = scan.nextLine();
        double result = 0;
        boolean valid = true;

        switch(operator){
            case "+":
               result = num+num1;
                break;
            case "-":
                result=num-num1;
                break;
            case "*":
                result = num*num1;
                break;
            case "/":
              result = num/num1;
                break;
            case "%":
                result = num%num1;
            default:
                System.out.println("invalid operator");
                valid = false;
        }

        if(valid) {
            System.out.println("" + num + operator + num1 + " = " + result);
        }

    }
}
