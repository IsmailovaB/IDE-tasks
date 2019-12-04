package javaTasks;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.nextLine().charAt(0);
        char b = scan.nextLine().charAt(0);
        boolean answer = a>b;

        System.out.println("answer: " + answer);

    }
}
