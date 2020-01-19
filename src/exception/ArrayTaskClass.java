package exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTaskClass {

    public static void main(String[] args) {

        int [] num = {1,2,3,4,5};
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the index:");
            int ind = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the number you want to change to:");
            int n = scan.nextInt();
            num[ind] = n;
        }catch (InputMismatchException e ){
            System.out.println("Invalid number entered");
        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Index doesn't exist");
        }finally {
            System.out.println(Arrays.toString(num));
        }

    }
}
