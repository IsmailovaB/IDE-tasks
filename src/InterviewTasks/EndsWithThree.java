package InterviewTasks;

import java.util.ArrayList;

public class EndsWithThree {
    public static void main(String[] args) {
        int[] arr= {13,34,44,13,23,43};
        System.out.println(endsWithThree(arr));

        int n = 100;
        for(int i = 0; i<n; i++){
            if(i%10==3){
                System.out.print(i+" ");
            }
        }
    }
//-----------------------------------------------------------------
    public static ArrayList<Integer> endsWithThree(int [] arr){
//        String str = "";
        ArrayList<Integer> str = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 3) {
                str.add(arr[i]);
            }
        }
        return str;
    }

}
