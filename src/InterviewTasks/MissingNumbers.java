package InterviewTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {
        int [] arr = {1,3,4,6,7,8};
//        int miss = missingNum(arr);
        missingNum(arr);
    }
//
//    public static int getMissingNo(int[] a, int n)
//    {
//       int total = (n + 1) * (n + 2) / 2;
//        for (int i = 0; i < n; i++)
//            total -= a[i];
//        return total;
//    }
    public static void missingNum(int[] arr){

        int max = 0;
        String s = "";
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 1; i < max; i++){
            boolean a = false;
            for(int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    a = true;
                }
            }
                if(!a){
                    s+=i+" ";
            }
        }
        System.out.println(s.trim());
    }
}
