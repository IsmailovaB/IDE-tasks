package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserToArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times do you want to enter");
        int size = scan.nextInt();
        scan.nextLine();  // Breaking the line!!!!

        String [] names = new String[size];

        for (int i =0; i <names.length; i++){
            System.out.println("Enter a name "+(i+1));
            names[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(names));

    }
}
