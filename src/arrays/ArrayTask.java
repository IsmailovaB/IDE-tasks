package arrays;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        String [] names = new String [4];
        names[0] = "Melana";
        names[1] = "kesha";
        names[2] = "sonya";
        names[3] = "feta";
        System.out.println(Arrays.toString(names));
        System.out.println(names[1]+ "\n" + names[2]);



        System.out.println();



        double [] arr  = {45.99, 23.5, 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1] = 112.89;
        System.out.println(Arrays.toString(arr));

    }

}
