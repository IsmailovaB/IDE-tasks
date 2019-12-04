package scanners;

import java.util.Scanner;

public class MinsToHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculates minutes into hours:");
        int minuts = scanner.nextInt();
        int hours = minuts/60;
        int remainminuts = minuts%60;
        System.out.println(minuts + "minutes is " + hours + "hours and " + remainminuts + "minutes");

    }
}
