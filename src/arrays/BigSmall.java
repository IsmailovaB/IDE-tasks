package arrays;

import java.util.Arrays;

public class BigSmall {
    public static void main(String[] args) {


        int[] nums = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(nums);
        System.out.println("Biggest number is: "+ nums[nums.length-1]);
        System.out.println("Smallest number is: "+nums[0]);
//        int big=nums[0];
//        int small=nums[0];
//        for (int num:nums){
//            if(big<num){
//                big=num;
//            }if(small>num){
//                small=num;
//            }
//        }
//        System.out.println("BiggestNum is: "+ big);
//        System.out.println("Smallest number is: "+small);





    }
}
