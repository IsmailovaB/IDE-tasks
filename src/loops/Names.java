package loops;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String name;
        for(int i =0; i<5; i++) {
            System.out.println("Please enter name " + (i + 1));
            name = scan.nextLine();
            System.out.println(name);
        }
    }
}
