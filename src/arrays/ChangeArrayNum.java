package arrays;

import java.util.Arrays;

public class ChangeArrayNum {
    public static void main(String[] args) {
//        0.5) Given numbers of 4,-2,5,-3,-20,30. Write a program that will
//        change any negative number to be 0. Print the changed array.
        int newN =0;
        int [] nums = {4,-2,5,-3,-20,30};
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                nums[i]=0;
            }
        }            System.out.println(Arrays.toString(nums));

    }
}
