package Strings;

public class Task10 {
    public static void main(String[] args) {

     String msg = "Sender: <James Bond>. From Number: [202-123-3456]. +Message: {“I love programming and problem solving}";


        int senderStart = msg.indexOf("<")+1; // When we don't want to add "<" (first char we move +1 char)it will not include "<"
        int senderEnd = msg.indexOf(">");
        int numberStart = msg.indexOf("[")+1;
        int numberEnd = msg.indexOf("]");
        int messageStart = msg.indexOf("{")+1;
        int messageEnd = msg.indexOf("}");

        String sub1 = msg.substring(senderStart,senderEnd);
        String sub2 = msg.substring(numberStart,numberEnd);
        String sub3 = msg.substring(messageStart,messageEnd);



        System.out.println("Sender: " + sub1);
        System.out.println("From Number: " +sub2);
        System.out.println("Message: " + sub3);
    }
}
