package scanners;

import java.util.Scanner;

public class PracticeApples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many apples do you have?");
        int myApples = input.nextInt();
        int female = 70;
        int male= 30;
        female *=85;
        male *=45;
        int total = female + male;
        System.out.println(myApples-total);

    }
}
