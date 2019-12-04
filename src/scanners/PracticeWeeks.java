package scanners;

import java.util.Scanner;

public class PracticeWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number");
        int myNumber = scanner.nextInt();
        int fullWeeks = myNumber/7;
        int remainderDay = myNumber%fullWeeks;
        int days = fullWeeks*7;
        int hours = days*24;
        int minutes = hours*60;
        int seconds = minutes*60;
        System.out.println(fullWeeks);
        System.out.println(remainderDay);
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);



    }
}
