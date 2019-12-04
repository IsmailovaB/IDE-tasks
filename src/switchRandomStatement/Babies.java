package switchRandomStatement;

import java.util.Scanner;

public class Babies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of babies");
        int numOfBabies = scan.nextInt();

        switch(numOfBabies){
            case 0:
                System.out.println("Sorry.");
                break;
            case 1:
                System.out.println("Good for you!");
                break;
            case 2:
                System.out.println("Wow twins!");
                break;
            case 3:
                System.out.println("Wow. Triplet!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Unbelievable " + numOfBabies + " babies!");
                break;
            default:
                System.out.println("I don't believe you.");
        }
    }
}
