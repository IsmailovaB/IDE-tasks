package InterviewTasks;

import java.util.Arrays;

public class SortWithoutSortingMethod {

    public static void main(String[] args) {
        int [] arr = {23,3,5,6,-9,42,1};
            int [] n = sortArray(arr);
        System.out.println(Arrays.toString(n));
    }

    public static int[] sortArray(int []arr){

        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
