package arrays;

import java.util.Arrays;

public class AddArrayNums {

    public static void main(String[] args) {
//        0.7) Given you have two arrays with values of:
//        3,2,6,43,7,20      and
//        2,7,-10,10,-5,2
//        Write a program that adds each element and stores them into a new array. Print the final array
        int [] nums = {3,2,6,43,7,20};
        int [] nums2 = {2,7,-10,10,-5,2};
        int [] sum = new int[nums.length];
        for(int i =0; i<nums.length; i++) {
            sum[i] =nums[i]+nums2[i];  // adding first and storing in the sum ex; 3+2=5 storing to "sum".
        }
        System.out.println(Arrays.toString(sum));

    }
}
