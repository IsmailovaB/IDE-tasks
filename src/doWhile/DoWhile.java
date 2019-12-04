package doWhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;

        String answer ="";

        do{
            System.out.println("Enter the number:");
            int num = input.nextInt();
            if(num>0){
                positive++;
            }else if(num<0){
                negative++;
            }else if(num==0){
                zero++;
            }
            System.out.println("Do you want to continue");
            answer = input.nextLine();

        }
        while(answer.equals("yes"));




        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);
    }
}
