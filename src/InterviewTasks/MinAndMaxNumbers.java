package InterviewTasks;

import java.util.Arrays;

public class MinAndMaxNumbers {
    public static void main(String[] args) {

        int [] grades = {15,25,33,35,34,46,65,38,65,98,89,3,500};

        //  Finding min. and max. numbers Using Arrays.sort method.
//        Arrays.sort(grades);
//        System.out.println("Min grade: "+grades[0]);
//        System.out.println("Max grade: "+grades[grades.length-1]);
        
        // Finding min. and max. numbers Without using sort method.
        int min = grades[0];
        int max = grades[0];
        for(int i = 0; i<grades.length; i++ ){
            if(max < grades[i]){
                max = grades[i];
            }
            if(min > grades[i]){
                min = grades[i];
            }
        }
        System.out.println("Min: "+min+"\nMax: "+max);
    }
}
