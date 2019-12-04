package ReplIt;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String newWord="";

        for(int i=0; i<words.length; i++){
char ch = words[i].charAt(0);
char last = words[i].charAt(words[i].length()-1);
newWord+=ch+last+"";
        }

        System.out.println(newWord);
    }
}
