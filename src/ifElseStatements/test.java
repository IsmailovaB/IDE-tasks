package ifElseStatements;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String word = scan.nextLine().trim();
String w = "jsdig";
        if(word.isEmpty()){
            System.out.println("Words is Empty");
        }
        else if(word.equals(w)){
            System.out.println(word);
        }
    }
}
