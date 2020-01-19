package InterviewTasks;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String [] arr = {"civic", "sdfavs", "bema","mommy"};

        for(int i=0; i<arr.length; i++){
            String s="";
            for(int j=arr[i].length()-1; j>=0; j--) {
                s += arr[i].charAt(j);
            }
            arr[i]=s;
        }
        System.out.println(Arrays.toString(arr));


        //1- Create a String
        String word = "We went to picnic today";

        //2- Create a logic to reverse the string
        String reversed ="";
        for(int i =word.length()-1; i>=0; i--){
            reversed+= word.charAt(i)+"";
        }
        System.out.println(reversed);

        //==========================================================


        //1- Create a String
        String str = "We went to picnic today";
        // Output should be "eW tnew ot cincip yadot"
        //2- Create a logic to reverse the string
        String reverse ="";
        String [] arr1 = word.split(" ");
        System.out.println(Arrays.toString(arr1));
        for(String w : arr1){
            for(int i=w.length()-1; i>=0; i--){
                reverse+=w.charAt(i)+"";
            }
            reverse+=" ";
        }
        System.out.println(reverse.trim());
    }
}
