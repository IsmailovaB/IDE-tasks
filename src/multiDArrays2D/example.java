package multiDArrays2D;

import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        int [] [] groups = new int [3][4];
        int [] num = {1,2,3};
        int [] num1={12,2,3,4,1,3};
        groups[0] =num;
        groups[1]=num1;
        System.out.println(Arrays.deepToString(groups));
        String [] [] group = new String [2][3];

        System.out.println(Arrays.deepToString(group));
    }
}
