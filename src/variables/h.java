package variables;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Please enter total seconds");
        int sec = scan.nextInt();


        int min = sec/60;
        int remain = sec%60;
        int hour = min/60;
        int rem = min%60;

        System.out.println(hour+ " hour"+"\n"+rem+" minutes "+"\n"+remain+"seconds");
    }
}
