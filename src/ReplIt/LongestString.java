package ReplIt;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        String biggest = "";
        for(String word:words){
            if(word.length()>biggest.length()){
                biggest+=word;
            }
        }
        System.out.println(biggest);
    }
}
