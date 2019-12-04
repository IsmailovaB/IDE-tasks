package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
//        String str = "Java is programming language";
//        String[] regular = str.split(" ");
//        char[] charArr = str.toCharArray();
//        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(regular));
//
//        //--------------------------------------------------------------------
//
//        String sent = "Write a program that creates a group of given size thisisabigword";
//        String[] newSen = sent.trim().split(" ");
//
//        int biggest = 0;
//        String biggestWord = "";
//        for (String word : newSen) {
//            if (word.length() > biggest) {
//                biggest = word.length();
//                biggestWord = word;
//            }
//        }
//        for (String word : newSen) {
//            if (word.length() == biggest) {
//                System.out.println(word);
//            }
//
//        }
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean check = false;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 5 && nums[i + 1] == 5) {
                check = true;
            }
        }System.out.println("nums -> "+Arrays.toString(nums) +" -> "+ check);

    }
}

