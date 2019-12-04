package ReplIt;

import java.util.Scanner;

public class FindFives {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String [] arr = sentence.trim().split(" ");
//        String rev="";

        for(int i=arr.length-1; i>=0; i--){
           String  rev=arr[i];
            System.out.println(rev);
        }


        System.out.println();
    }
            }


