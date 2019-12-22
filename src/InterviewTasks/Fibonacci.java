package InterviewTasks;

import codingBat.ArrayList;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
//       beFibonacci(10);
//        System.out.println(fibon(10));
//        System.out.println(fibonacciWithArr(10));
        System.out.println(fibonacci(10));
    }

//    public static void beFibonacci(int N) {
//
//        int num1 = 0;
//        int num2 = 1;
//        System.out.println("The first " + N + " numbers of the fibonacci series are:");
//        String s = "0+1";
//        for (int i = 0; i < N; i++) {
//            System.out.print(num1 + " ");
//            int sum = num1 + num2;
//            num1 = num2;
//            num2 = sum;
//        }
//    }


    //===================================================================

    public static String fibonacci(int num) {

        int num1 = 0;
        int num2 = 1;
        String fibNum = "0 1 ";

        for (int i = 2; i < num; i++) {
            int sum = num1 + num2;
            fibNum += sum + " ";
            num1 = num2;
            num2 = sum;
        }
        return fibNum.trim();
    }

    //=======================================================

    public static String fibonacciWithArr(int num) {

        int[] arr = new int[num];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

        }
        return Arrays.toString(arr).replace("[", "").replace("]", "");
    }
}
