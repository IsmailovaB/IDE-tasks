package doWhile;

import java.util.Scanner;

public class BegimaiPolindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int count = 0;
        String reverse = "";                   // palindrome reverse the word
        while(count<name.length()){
            System.out.print(name.charAt(count));
            count++;
        }
        System.out.println();

        int rev = name.length()-1;
       while(rev>=0){
           reverse = reverse+name.charAt(rev);
           rev--;
        }
        System.out.println(reverse);
       if(reverse==name.toUpperCase()){
           System.out.println("It is palindrome");
       }else{
           System.out.println("It's not palindrome");
       }
    }
}
