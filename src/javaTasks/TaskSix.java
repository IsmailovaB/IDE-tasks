package javaTasks;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char num1 = scan.nextLine().charAt(0);
        char num2 = scan.nextLine().charAt(0);
        boolean answer = num1 == num2;

        System.out.println("The answer is: " + answer);

   }
}
