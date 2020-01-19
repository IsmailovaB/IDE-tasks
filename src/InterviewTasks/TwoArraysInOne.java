package InterviewTasks;

import codingBat.ArrayList;

import java.util.Arrays;

public class TwoArraysInOne {

    public static void main(String[] args) {

        int [] arr1 = {2,23,45,3,4};
        int [] arr2 = {45,5,3,23,4};

        int [] ar = arraysInOne(arr1,arr2);
        System.out.println(Arrays.toString(ar));
//StringBuilder sb = new StringBuilder();
        int [] arr = new int[arr1.length+arr2.length];
        for(int i=0, j=0; i<arr.length; i++){
            if (i<arr1.length){
                arr[j++] = arr1[i];
            }
            if(i<arr2.length){
                arr[j++] = arr2[i];
            }
        }

//        System.out.println(Arrays.toString(arr));

//-----------------------------------------------------------------------

    //  Two Strings in one;
        String word = "Bem";
        String num = "12349";
        String s="";
        for (int i=0; i<word.length()+num.length(); i++){
            if(i<word.length()){
              s+=word.charAt(i);
            }
            if(i<num.length()){
                s+=num.charAt(i);
            }
        }
        System.out.println(s);
    }




    public static int [] arraysInOne(int [] arr1, int [] arr2){

        int [] total = new int [arr1.length+arr2.length];
        int ind = 0;
        for(int i=0; i<arr1.length; i++){
            total[ind] = arr1[i];
            ind++;
        }
        for(int i = 0; i<arr2.length; i++){
            total[ind] = arr2[i];
            ind++;
        }
        return total;
    }
}
