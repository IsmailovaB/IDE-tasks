package arrays;

import java.util.Arrays;

public class RandomArr {
    public static void main(String[] args) {
//        Random ran = new Random();
//        int [] arr = new int[50];
//
//        for (int i =0; i<arr.length; i++){
////            arr[i] = ran.nextInt(100)+1;
//            int num = ran.nextInt(100)+1;
//            arr[i]=num;
//        }
//        System.out.println(Arrays.toString(arr));

        // -----------------------------------------------------------------
//        7) Given an array with values of: 1,2,-3,4,-34,55,78,90,33,10
//        Take our all the even numbers from the array and put them into a new array.
//                Print the new array
        int [] num = { 1, 2, -3, 4, -34, 55, 78, 90, 33, 10};

        int count = 0;
        for(int i =0; i<num.length; i++) {
            if (num[i]%2==0) {
                count++;
            }
        }
        int [] evenNum = new int[count];      // count has only even numbers. Now in arrays (count) 3 even numbers.
        for(int i=0,  j=0; i<num.length; i++) {
            if (num[i] % 2 == 0) {
                evenNum[j] = num[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evenNum));

    }
}
