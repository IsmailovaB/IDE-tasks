package scanners;

import java.util.Scanner;

public class ConverSom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int som, som100, som50, som20, som10, som5, som1, remain ;

        System.out.println("print your value: ");

        som = scan.nextInt();
        remain = som;

        som100 = som/100;
        remain = remain%100;

        som50 = remain/50;
        remain = remain%50;

        som20 = remain/20;
        remain = remain%20;

        som10 = remain/10;
        remain = remain%10;

        som5 = remain/5;
        remain = remain%5;
        som1 = remain;


        System.out.println("Your value of " + som + " is converted to:");
        System.out.println("100 som: "+ som100);
        System.out.println("50 som: "+ som50);
        System.out.println("20 som: "+ som20);
        System.out.println("10 som: "+ som10);
        System.out.println("5 som: "+ som5);
        System.out.println("1 som: "+ som1);
    }
}
