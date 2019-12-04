package arrays;

import java.util.Arrays;

public class LengthArray {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names)); //  if there is nothing it will show String: "null"/ int: "0"
        names[0] = "jamie";
        names[1] = "bob";
        names[2] = "nemo";

        for(int i = 0; i<names.length; i++){
            System.out.println("name " + (i+1) + " is " + names[i]);
            System.out.println("first character of name " + (i+1) + " is " + names[i].charAt(0));
        }
    }
}
