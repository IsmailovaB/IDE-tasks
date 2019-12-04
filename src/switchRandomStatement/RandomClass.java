package switchRandomStatement;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random ran = new Random();

        int number = ran.nextInt(100);  //it will give you any random number from 0-99.(100 not include)
        System.out.println(number);

    }
}
