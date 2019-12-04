package loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = scan.nextLine();
        String reverse = "";

        for(int i=word.length()-1; i>=0; i--) {
            reverse += word.charAt(i);
//            System.out.print(word.charAt(i));
        }
        System.out.print(reverse);
        }
}