package Strings;

import java.util.Scanner;

public class Task85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int am = str.indexOf("am")+3;
        int years = str.indexOf(" years");
        String age = str.substring(am,years);
        int ageNum = Integer.valueOf(age);

        ageNum+=5;
        System.out.println("In 5 years you're gonna be" + ageNum);



    }
}
