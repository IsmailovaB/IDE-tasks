package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfRange {
    public static void main(String[] args) {
        //1- Print out the welcome&intro message
        System.out.println("Welcome to DIVIDE MY ARRAY");
        Scanner scan = new Scanner(System.in);

        //2- Accept an int input from user and assign it as the size of the Array
        System.out.println("Enter a number that will be the size");

        //3- Print out "enter number for your array" message
        int [] nums  = new int[scan.nextInt()];
        for(int i=0; i<nums.length; i++){

            //4- Accept int input values from user and assign them as the elements of the array
            System.out.println("Enter number");
            nums[i] = scan.nextInt();
        }
        //5- Print out "string value" of the array
        System.out.println("The string value of array: "+ Arrays.toString(nums));

        //6- Create a logic to print out first and second half of the arrays in different lines
        int [] firstHalf = Arrays.copyOfRange(nums,0,nums.length/2);
        int [] secondHalf = Arrays.copyOfRange(nums,nums.length/2,nums.length);
        System.out.println("The first half of array: "+ Arrays.toString(firstHalf));
        System.out.println("The second half of array: "+ Arrays.toString(secondHalf));


    }
}
