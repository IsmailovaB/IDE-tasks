package loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
//        for(int i = 0; i < 5;  i++){
//            System.out.println("hello world");
//        }
//        System.out.println("END");
//
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//
//        for(int n =0; n <15; n++ ){
//            System.out.println(+n + " Welcome, "+name);
//        }
//        System.out.println();
//        for(int i=1; i< name.length(); i++){
//            System.out.println(name.charAt(i)+ " for index "+ i);

//        for (int n = 1; n < 50; n++) {
//            if (n == 26) {
//                continue;
//            }
//            if (n == 40) {
//                break;
//            }
//            if (n % 2 == 0) {
//                System.out.print(n + " . ");
//            }


                System.out.println("Please enter word:");
                Scanner scanner = new Scanner(System.in);
                String n1 = scanner.nextLine();

                // Your code here
                //------------------------------------------------

                 if(n1.startsWith("xx")) {
                     System.out.println(n1.substring(2));
                 } else if(n1.substring(0,1).equalsIgnoreCase("x")){
                    System.out.println(n1.substring(1));
                }else if(n1.substring(1,2).equalsIgnoreCase("x")){
                    System.out.println(n1.substring(0,1)+n1.substring(2));

                }else if(n1.substring(2,3).equalsIgnoreCase("x")){
                    System.out.println(n1);
                }
            }
        }









