package methods;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySize {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createRandomArray(5,10)));

    }
    public static int [] createRandomArray(int size, int bound){
        int [] arr = new int[size];
        Random ran = new Random();

        for(int i=0; i<size; i++) {
            int num = ran.nextInt(bound);
            arr[i]=num;
        }
        return arr;
    }
}
