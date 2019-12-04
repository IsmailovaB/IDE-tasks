package arrays;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "It started to snow in Chicago";
        String [] arr = str.toLowerCase().split(" ");   // all words in LowerCase
        System.out.println(Arrays.toString(arr));

        String finalStr ="";
        for(String word:arr) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            finalStr+=rev+" ";
        }

        System.out.println(finalStr);

    }
}
