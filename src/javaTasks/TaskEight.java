package javaTasks;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int change, remain, quarter, dimes, nickles, pennies;
        System.out.println("Enter your change");
        change = scan.nextInt();
        remain = change;

        quarter = change/25;
        remain = remain%25;

        dimes = remain/10;
        remain = remain%10;

        nickles = remain/5;
        remain = remain%5;

        pennies = remain;

        System.out.println("You change of " + change + " was converted to: ");
        System.out.println("Quarters: " + quarter);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);




    }
}
