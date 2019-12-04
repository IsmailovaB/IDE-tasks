package loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num");
        int number = scan.nextInt();

        int n =0;
        while(n<number){
            System.out.println(n++);

        }
    }
}
