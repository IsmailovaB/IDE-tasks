package methods;

import java.util.Arrays;

public class DifferenceBetweenBigAndSmall {
    public static void main(String[] args) {
        System.out.println(differenceFromString("4252476"));    // 7-2=5;
    }
    public static int differenceFromString(String num1) {
        String[] arr = num1.split("");
        Arrays.sort(arr);                        //When we sort nums it will show us from smallest to biggest.
        return Integer.valueOf(arr[arr.length - 1]) - Integer.valueOf(arr[0]);     // from biggest num we subtract the smallest num.
    }
}