package InterviewTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,65,6};
        int [] reverse = new int [arr.length];
        for(int i = arr.length-1, j=0; i>=0; i--){
            reverse[j++] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));

//------------------------------------------------------
        int n = 12345;

        String str = n+"";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        int revNum = Integer.parseInt(rev);
        System.out.println(revNum);
//-------------------------------------------------------



    }
}
