package InterviewTasks;

import codingBat.ArrayList;

import java.util.Arrays;

public class TwoArraysInOne {

    public static void main(String[] args) {

        int [] arr1 = {2,23,45,3,4};
        int [] arr2 = {45,5,3,23,4};

        int [] ar = arraysInOne(arr1,arr2);
        System.out.println(Arrays.toString(ar));
StringBuilder sb = new StringBuilder();
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
