package arrays;

import java.util.Arrays;

public class UniqueTwoBiggestNums {
    public static void main(String[] args) {
        int[] nums = {23, 1, 34, 3, 54, 54, 51,54};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        String check = "";
        int count =0;
        for(int i =nums.length-1; i>=0; i--){
            if(count==2){
                break;
            }
            if(!check.contains(nums[i]+"")){

                check+=nums[i]+" ";
                count++;
                System.out.println(nums[i]+" ");
            }
        }
    }
}
