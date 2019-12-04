package javaTasks;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a boolean: ");
        boolean input = scan.nextBoolean();

        System.out.println("Opposite: ");
        System.out.println(!input);



    }
}
