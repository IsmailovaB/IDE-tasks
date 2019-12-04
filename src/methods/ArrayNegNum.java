package methods;

import java.util.Arrays;

public class ArrayNegNum {
    public static void main(String[] args) {
        int [] arr2 ={5,3,3-6,-3,-4,5,7};
        negNum(arr2);      // negNum(4,5,74,2,3,4,-7)
        replaceNegNum(arr2,50);
    }
    public static void negNum(int [] arr){    // (int ... arr){  -- we can put nums directly in call raw 6.
        for(int num:arr){
            if(num<0){
                System.out.println(num);
            }
        }
    }

//    Write a method accepts an int array and a number.
//    Replace any negative numbers in your array with the given number. Print the array
    public static void replaceNegNum(int [] arr, int num){
        for (int i=0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i]=num;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
