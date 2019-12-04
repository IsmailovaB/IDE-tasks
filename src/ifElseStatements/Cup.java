package ifElseStatements;

import java.util.Scanner;

public class Cup {
    public static void main(String[] args) {
        int passCode = 3241;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your passCode:");
        int userCode = scan.nextInt();

        if (userCode==passCode) {
            System.out.println("Welcome to iPhone");
        }

        else if (userCode<0){
            System.out.println("No negative number");
        }
        else if (userCode>9999){
            System.out.println("You entered more digits");
        }
        else if (userCode<1000){
            System.out.println("You entered Less digits");
        }
        else{
            System.out.println("Wrong passCode!Try again!");
        }
    }
}


