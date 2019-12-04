package nestedLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AppleTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        3) Write a program that asks the user to enter a word.
//                Print out how many times a character is in the given word.
//                > input: apple
//                > output:
//        apple has 1 a
//        apple has 2 p
//        apple has 1 l
//        apple has 1 e
        String word = scan.nextLine();
        String checked = "";
               for(int i = 0; i<word.length(); i++) {
                   int count = 0;
                   if (!checked.contains(word.charAt(i) + "")) {
                       for (int j = 0; j < word.length(); j++) {
                           if (word.charAt(i) == word.charAt(j)) {
                               count++;
                           }
                       }
                       checked += word.charAt(i) + " ";
                       System.out.println(word + " has " + count + " " + word.charAt(i));
                   }
               }


//        -------------------------------------------------------------
//        4) [IQ] Palindrome: A word that is the same read forwards and backwards. User takes a word from the console. Print true if the word is a palindrome. Print false if the word is not palindrome.
//               > input: civiv
//               > output: true
//               System.out.println("Enter a word: ");
        String word1 = scan.nextLine();
        String back = "";

        for(int i = word1.length()-1; i>=0; i--){
            back+= word1.charAt(i);
        }
        System.out.println(word1);
        System.out.println(back);

        if(word1.equals(back)){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not a polindrome");
        }



    }
}
