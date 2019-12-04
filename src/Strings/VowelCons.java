package Strings;

import java.util.Scanner;

public class VowelCons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String str = input.next().toLowerCase();
        int len = str.length();

        if(str.length()==1){
            if((str.charAt(0)>=97 && str.charAt(0)<=122)){
                if(str.equals("a")||str.equals("e")||str.equals("i")||str.equals("u")||str.equals("o")){
                    System.out.println("Input letter is Vowel");
                }else {
                    System.out.println("Input letter is Consonant");
                }
            }
        }else if(str.length()>1){
            System.out.println("ERROR. It should be exactly 1 character length");
        }

    }
}
