package loops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//       String word = "Cybertek";
//
//       for(int i =0; i<=word.length(); i++){
//
//           if(word.charAt(i)=='b'){
//               String s = word.charAt(i) + "";  // this is how we turn char into string. output CyBertek
//                                                //whenever we concat"+" with String ex;  ""  - it will turn to string.
//           System.out.println(s.toUpperCase()+" "+i);
//           continue;
//
//       }if(word.charAt(i)=='t');
        Scanner scan = new Scanner(System.in);
        String password = "secret478";

//        for(;;) {
//            System.out.println("please enter your password");
//            String pass2 = scan.nextLine();
//            if (password.equals(pass2)) {
//                System.out.println("Welcome to your profile!");
//                break;
        int attempt = 0;
        for (; ; attempt++) {

            if (attempt == 3) {
                System.out.println("Your account is locked");
                break;
            }


            System.out.println("Enter your password: ");
            String pass2 = scan.nextLine();
            if (password.equals(pass2)) {
                System.out.println("Welcome to your account!");
                break;
            }
        }
    }
}



