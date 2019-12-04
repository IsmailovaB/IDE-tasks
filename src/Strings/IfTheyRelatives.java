package Strings;

import java.util.Scanner;

public class IfTheyRelatives {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String name1 = scan.nextLine().trim();
        String name2 = scan.nextLine().trim();

        String lastName = name1.substring(name1.indexOf(" ")+1);
        String lastName2 = name2.substring(name2.indexOf(" ")+1);


         if(lastName.equals(lastName2)) {
             System.out.println("relatives");
         }
         else{
             System.out.println("not relatives");
         }

    }
    }