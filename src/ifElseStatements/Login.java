package ifElseStatements;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "cybertek1";
        String password = "Cybertek123";

        System.out.println("Please enter your username: ");
        String userName = scan.nextLine();



        if (username.equals(userName)) {
            System.out.println("Please enter your password");
        } else {
            System.out.println("Invalid username");
        }
        String password1 = scan.nextLine();
        if (password1.equals(password)) {
            System.out.println("Login successfull!");
        } else {
            System.out.println("Wrong password");
        }

    }
//
//        if (username.equals(userName)) {
//            System.out.println("Please enter your password");
//            String password1 = scan.nextLine();
//            if (password1.equals(password)) {
//                System.out.println("Login successfull!");
//            } else {
//                System.out.println("Wrong password");
//
//            }
//        }
//         else{
//                System.out.println("Invalid username. Try again.");
//            }
//        }

    }
