package ReplIt;

import java.util.Arrays;

public class MethodWithArraysDeleteElement {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,3,};
        System.out.println(Arrays.toString(deleteR(arr,2)));
    }
    public static int[] deleteR(int[] arr,int element) {
    int [] newArr = new int [arr.length];

        for(int i=0; i<newArr.length; i++){
        if(arr[i]!=element){
            newArr[i]=arr[i];
        }else{
           continue;
        }
    }
        return newArr;

}
}
