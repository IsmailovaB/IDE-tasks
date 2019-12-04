package methods;

import java.util.Arrays;

public class AddNumsToString {
    public static void main(String[] args) {
//        int[] arr2= {23,45,32,2,4,6};
//        toStringNums(34,46,6,4,2,2);
        addNums("23456476",5);
    }
    public static void toStringNums(int... arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+", ");
        System.out.println(arr.length-2+"]");
    }

    public static void addNums(String number, int add) {
        String[] nums = number.split("");
        int [] intArr = new int [nums.length];
        for (int i = 0; i < nums.length; i++){
        intArr[i]=Integer.valueOf(nums[i])+add;   // converting string number into integer number inside the arr, and add numbers.
//          number[i]+num;

        } System.out.println(Arrays.toString(intArr));
    }


}
