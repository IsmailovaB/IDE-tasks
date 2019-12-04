package nestedLoop;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;

        for(int i =num; i<=num2; i++) {
            sum +=i;

        }
        System.out.println("The sum of "+ num+ " to "+num2+ " is: "+ sum);
    }
}
