package doWhile;

import java.util.Scanner;

public class AccessToEmail {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String user = "admin@";
        String pass = "admin12345";

        int attempt = 5;
        String username = "";
        String password = "";

        do{


            if(attempt==0){
                System.out.println("Your attempt is "+attempt+" it's deactivated for 30 sec.");
                return;
            }
            attempt--;
            System.out.println("Please enter your username: ");
            username = scan.nextLine();
            if(!username.equals(user)){
                System.out.println("Wrong username:");
                System.out.println("Your attempt: "+attempt);

                continue;
            }
                System.out.println("Please enter your password: ");
                password = scan.nextLine();
            if(!password.equals(pass)){
                System.out.println("Wrong password:");
                System.out.println("Your attempt: "+attempt);
            }


        }while(!username.equals(user)||!password.equals(pass));

        System.out.println("Login successful!!!");



    }
}
