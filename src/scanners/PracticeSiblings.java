package scanners;

import java.util.Scanner;

public class PracticeSiblings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Siblings ages?");
        int sibling1 = scanner.nextInt();
        int sibling2 = scanner.nextInt();
        int sibling3 = scanner.nextInt();
        int sibling4 = scanner.nextInt();
        int sibling5 = scanner.nextInt();
        int sibling6 = scanner.nextInt();
        int avarage = (sibling1+sibling2+sibling3+sibling4+sibling5+sibling6)/6;
        System.out.println(avarage);
        int remainder = avarage%6;
        System.out.println(remainder);
        int evenOrOdd = remainder%2;
        System.out.println("Either Even or Odd: " + evenOrOdd);
        System.out.println("My number is: " + evenOrOdd);










    }
}
