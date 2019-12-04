package javaTasks;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        boolean answer = num1>num2;

        System.out.println("The aswer is: " + answer);
    }
}
