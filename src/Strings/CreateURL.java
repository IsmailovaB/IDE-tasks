package Strings;

import java.util.Scanner;

public class CreateURL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();

        if(url.startsWith("www.")){
            System.out.println("correct url");
        }else{
            System.out.println("Invalid url format");
            return;
        }
//        int ind = url.length()-4;
//        url.lastIndexOf(".");
//        if (url.charAt(ind)=='.'){
        if(url.charAt(url.length()-4)=='.'){

            System.out.println(" . is before the extention");
        }else{
            System.out.println(" . might be misplaced");
        }
    }
}
