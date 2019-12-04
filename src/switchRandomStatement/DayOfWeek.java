package switchRandomStatement;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter a number of a day of the week");
//       int num = scan.nextInt();
//
//       switch (num){
//           case 1:
//               System.out.println("");
//    }
       String word = scan.nextLine();
       char c = word.charAt(4);
       char d = word.charAt(5);
       char e = word.charAt(6);
        System.out.print(c+""+ d+""+d);
    }
}
