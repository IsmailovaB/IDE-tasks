package methods;

import java.util.Scanner;

public class StringInsideString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        twoStrings("java is a fun","o");
    }
    public static void twoStrings(String word1, String word2){
        Scanner input = new Scanner(System.in);
        if(word1.contains(word2)) {
            word1 = word1.replace(word2, "");
            System.out.println(word1.trim());
        }else{
            System.out.println("enter another string:");
            String word3 = input.nextLine();
            if(word1.contains(word3)){
                word1 = word1.replace(word3, "");
                System.out.println(word1.trim());
            }else{
                System.out.println("out of tries");
            }
        }
    }
}
