package scanners;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int x = 5;
         int y = x++;
         y = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(y);


//        System.out.println(age);
//        System.out.println(++age); // preIncrement
//        System.out.println(age++); //postIncrement
//        System.out.println(age);
//
    }
}
