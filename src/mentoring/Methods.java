package mentoring;

import java.util.Arrays;

public class Methods {
    //    public static void main(String[] args) {
//
//    }
    public static void main(String[] args) {
        Methods mt = new Methods();
        System.out.println(mt.reverseString("Hello guys"));

    }

    public String reverseString(String word) {

    //2- Create a logic to reverse the string
    String reversed = "";
        for(int i = word.length() - 1; i>=0;i--) {
        reversed += word.charAt(i) + "";
    }
        return reversed;
}
}
