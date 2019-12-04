package ReplIt;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        //Write your code below
        int count =0;
        for(int i =0; i<email.length(); i++){
            char check = email.charAt(i);
            if(check=='@'){
                count++;
            }
        }
        String [] emails = email.split("@");
        if(count>1||count==0){
            System.out.println("invalid email");
        }else{
            System.out.println("Email id: "+ emails[0]);
            System.out.println("Email domain: "+ emails[1]);
        }
    }
}
