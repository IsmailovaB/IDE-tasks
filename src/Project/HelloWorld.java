package Project;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write two words in one line");
        String str = scan.nextLine().trim();

        int space = str.indexOf(" ");
        String word1 = str.substring(0,space);
        String word2 = str.substring(space+1);
        int sum = word1.length()+word2.length();
        System.out.println("The length of the words is: "+sum);
        System.out.print(word1.substring(0,1).toUpperCase()+word1.substring(1));
        System.out.println(" "+word2.substring(0,1).toUpperCase()+word2.substring(1));

    }
}
