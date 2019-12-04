package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean check = false;

        for(int i=0; i<nums.length; i--){
            if(nums[i] == 5 && nums[i+1]==5){
                check = true;

            }else{
                System.out.println(Arrays.toString(nums)+check);
            }
        }

    }
}
