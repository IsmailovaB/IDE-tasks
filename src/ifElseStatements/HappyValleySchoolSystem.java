package ifElseStatements;

import java.util.Scanner;

public class HappyValleySchoolSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
                int var = scan.nextInt();
                boolean bln = true;


                if (var<2 || var >18){
                    System.out.println("Ineligible");
                }  else if(var==2){
            System.out.println("Toddler");
                }  else if(var==6 || var==7){
            System.out.println("");
        }
    }
}
