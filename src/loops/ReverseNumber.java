package loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String num = scan.nextLine();
//        String reverse = "";
//        for(int i=num.length()-1; i>=0; i--){
//            reverse+= num.charAt(i);
//        }
//        System.out.println("Reverse of " +num+ " is " + reverse);
        Scanner input = new Scanner(System.in);
        String guestList ="";
        String answer = "";
        do{
            System.out.println("Please enter guest name:");
            String guestName =input.nextLine();
            guestList+=guestName+", ";
            System.out.println("Do you want to enter new guest name:");
            answer=input.nextLine();
        }while(answer.equals("yes"));

        System.out.print("Guest's list: "+ guestList.substring(0,guestList.length()-2));
    }
}
