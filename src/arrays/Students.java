package arrays;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
//        4) Create String array for students. Initialize with students below: 
//        James, John, Adam, Elize, Jamie, Benzema
//        Loop through each elements of students. 
//        - print last character of each name on each line.
//        - Part II * Modify the loop and print the player names whose name ends with "s";
//        - Part III * Modify and print the player if it contains "s"
//        Part IV * Read the String from the user using Scanner and print out the
//        players that contains the entered String keyword by user.
//          String [] names = {"James", "John", "Adam", "Elize", "Jamie", "Benzema"};
//        String [] names = new String[6];
//        names[0] = "James";
//        names[1] = "John";
//        names[2] = "Adam";
//        names[3] = "Elize";
//        names[4] = "Jamie";
//        names[5] = "Benzema";
//        for(int i =0; i<names.length; i++){
//            int last = names[i].length()-1;
//            System.out.println(names[i].charAt(last));
//        }
//        System.out.println();
//
//        for(int i =0; i<names.length; i++){
//            if(names[i].toLowerCase().endsWith("s")){
//                System.out.println(names[i]);
//            }
//        }
//        System.out.println();
//
//        System.out.println("Enter a string");
//        Scanner scan = new Scanner(System.in);
//        String user = scan.nextLine();
//
//        for(int i=0; i<names.length; i++){
//            if(names[i].toLowerCase().contains(user)){
//                System.out.println(names[i]);
//
//            }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str2 = input.nextLine();
                String palindrom = "";
                for(int i = str2.length()-1; i>=0; i--){
                    palindrom+=str2.charAt(i);
                }
                if(str2.equalsIgnoreCase(palindrom)){
                    System.out.println("Palindrome");
                }else{
                    System.out.println("Not palindrome");
        }
    }
}
