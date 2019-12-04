package scanners;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Month");
        int month = input.nextInt();
        input.nextLine();
        System.out.println("Day:");
        int day = input.nextInt();
        input.nextLine();
        System.out.println("Year:");
        int year = input.nextInt();
        input.nextLine();
        String result = month + "/" + day +"/" + year;
        System.out.println(result);
        year += 5;
        day -=1;
        String result2 = month + "/" + day +"/" + year;









    }
}
