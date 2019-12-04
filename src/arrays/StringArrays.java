package arrays;

import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names)); //  if there is nothing it will show String: "null"/ int: "0"
        names[0] = "jamie";
        names[1] = "bob";
        names[2] = "nemo";
        System.out.println(Arrays.toString(names));

        System.out.println(names[0].charAt(0));
        System.out.println(names[2].substring(0,3).toUpperCase());

        names[1] = names[1].substring(0,1).toUpperCase()+names[1].substring(1).toLowerCase();
        System.out.println(names[1]);

    }
}
