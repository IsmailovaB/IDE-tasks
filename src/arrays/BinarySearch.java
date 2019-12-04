package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int [] nums ={2,5,7,14};
//        System.out.println("Index of 2 is: "+Arrays.binarySearch(nums,2));
//        System.out.println("Index of 7 is: "+Arrays.binarySearch(nums,7));
//        System.out.println("Index of 3 is: "+Arrays.binarySearch(nums,3));  // when there is no this num in array,it will gives us negative num,
//                                                                                  // searching by place where would've been this num and add+1 and negative.



        int[] numbers ={45,23,6,-3,66};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Index of 3 is: "+ Arrays.binarySearch(numbers,-3));
    }
}
