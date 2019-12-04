package doWhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessNumRan {
    public static void main(String[] args) {

//        int num = 20;
//        do{
//            System.out.println(num);
//            num++;
//        }while(num>10);
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
       int randNum = ran.nextInt(100)+1;
        System.out.println(randNum);
        int count = 0;
        int guess = 0;

        do{
            System.out.println("guess the number: ");
            guess = scan.nextInt();
            count++;
            if(guess<randNum){
                System.out.println("too low");
            }else if(guess>randNum){
                System.out.println("too high");
            }else{
                System.out.println("you guessed after "+count+ " tries.");
            }
        }while (guess!=randNum);

    }

}
