package Strings;

import java.util.Random;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) {
//        2) Send Message: User will enter a message, if message is valid it will be sent, there is a chance the message will not be delivered due to internet
//> User takes a message that needs to be at least 15 characters
//                > If the message is valid user will see message: “sent” and “not sent” if the message was not valid
//                > If message was sent there is a 50 % chance the message will not be delivered.  >> If the message is delivered user will see message: “ delivered”
//        HINT: use random number for random chance to send
//
//   }
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Please, enter your message:");
        String message = scan.nextLine();

        if (message.length()>=15) {
            System.out.println("Message was sent");
            int chance = ran.nextInt(2);        // we have 2 chance: delivered or not delivered.       (bound: 10)   with remainder:
                                                                                           //            if(chance%2==1){
            if (chance == 1) {
                System.out.println("Delivered");
            } else {
                System.out.println("not delivered");
            }
        } else{
            System.out.println("Message not sent");
        }
    }


}
