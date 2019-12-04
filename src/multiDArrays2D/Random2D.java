package multiDArrays2D;

import java.util.Arrays;
import java.util.Random;

public class Random2D {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(randomArr(4,5)));
    }
    public static int [] [] randomArr(int num1, int num2){

        Random ran = new Random();
//        int ranNum = ran.nextInt(100);
        int [][] nums = new int [num1][num2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j]=ran.nextInt(100);
            }
        }
        return nums;
    }
}
