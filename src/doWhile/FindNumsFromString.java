package doWhile;

import java.util.Scanner;

public class FindNumsFromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str1 = input.nextLine();
        String word = "";
        int lengs = str1.length();
        if (lengs < 3 || lengs > 100) {
            System.out.println("Invalid enter");
        } else if (lengs >= 3 && lengs <= 100) {
            for (int i = 0; i < lengs; i++) {
                char str2 = str1.charAt(i);
                if (str2 >= 48 && str2 <= 57) {
                    word += str2;
                }

            }
            System.out.println(word);
        }
    }
}