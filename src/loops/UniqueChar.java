package loops;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            String word2 = word.substring(i, i + 1);
            if (unique.contains(word2)) {
                unique = unique;
            } else {
                unique += word2;
            }

        }
        System.out.println(unique);
    }
}
