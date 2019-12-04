package Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LenghtTask {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = scan.nextLine();

        if(message.isEmpty()){
            System.out.println("Message is empty");
        }else if(message.length()>=10){
            System.out.println("Message is good");
        }else{
            System.out.println("Message is too short");
        }



    }
}