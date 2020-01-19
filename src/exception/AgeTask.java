package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();
        int age = 0;

        try{
            System.out.println("Enter your age");
            age = scan.nextInt();

        }catch (InputMismatchException e){
            System.out.println("Invalid age");
            System.out.println(e.toString());
        }
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
