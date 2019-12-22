package multiDArrays2D;

import mentoring.Methods;

import java.util.Arrays;

public class DiagonalDifference {
    public static void main(String[] args) {


//        Random ran = new Random();
////        int [][] arrs = ran.nextInt();
//        int [] [] arrNums = new int[3][4];
        int [][] arrs = Random2D.randomArr(4,5);
        System.out.println(Arrays.deepToString(arrs));
        System.out.println(differenceArr(arrs));
    }
    public static void printArr(int[][] a){
        for(int[]num:a){
            System.out.println(Arrays.toString(num));
        }
    }
    public static int differenceArr(int[][] arr){
        int sum1=0;
        int sum2=0;
        for(int i=0, j=arr.length-1; i<arr.length; i++,j--){
            sum1+=arr[i][i];
            sum2+=arr[j][j];
        }

        return Math.abs(sum1-sum2);
    }
}
