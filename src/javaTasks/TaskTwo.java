package javaTasks;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int count = 0;
        num += num2;
        count++;
        System.out.println("Your number is: " + num + " after being incremented by " + num2 + " " + count + " times");
        num += num2;
        count++;
        System.out.println("Your number is: " + num + " after being incremented by " + num2 + " " + count + " times");
        num += num2;
        count++;
        System.out.println("Your number is: " + num + " after being incremented by " + num2 + " " + count + " times");


    }
}
