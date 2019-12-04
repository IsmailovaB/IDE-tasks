package switchRandomStatement;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your letter grade:");
        char c = scan.nextLine().charAt(0);


        switch(c){
            case 'a':
                case'A':
                System.out.println("Excellent!");
                break;
            case 'b':
                case'B':
                System.out.println("Great");
                break;
            case 'c':
                case'C':
                System.out.println("Okay");
                break;
            case 'd':
                case'D':
                System.out.println("You can do better");
                break;
            case 'f':
                case'F':
                System.out.println("Something needs to change");
                break;
            default:
                System.out.println("Not a valid letter grade");

        }


    }
}
