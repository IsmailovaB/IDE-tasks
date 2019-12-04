package Strings;

//import java.util.Scanner;

public class NameHasA {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        String name = scan.nextLine();
//
//        if(name.isEmpty()){
//            System.out.println("Invalid name");
//        }else if (name.contains("a")){
//            System.out.println("Cool name");
//        }else{
//            System.out.println("Okay name");
//        }
        String sentence = "I wrote [2364] lines of codes";


         int stop = sentence.indexOf("[")-1;
        System.out.println(sentence.substring(0,stop));
        int start = sentence.indexOf('[')+1;
        int end = sentence.indexOf(']');
        System.out.println(sentence.substring(start,end));
        int half = sentence.length()/2;

        System.out.println(sentence.substring(half).trim());
        String count = sentence.substring(start,end);
        if(count.length()<=100){
            System.out.println("Less codes");
        }else if (count.length()<200){
            System.out.println("write more codes");
        }else{
            System.out.println("Good job!");
        }

    }
}
