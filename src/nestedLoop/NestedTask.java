package nestedLoop;

import java.util.Scanner;

public class NestedTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
//        1) Write a program that asks the user to enter a number.
//        The number will be how big your square will be. Square made of ‘#’ sign
//                > input: 5
//                > output:
//# # # # #
//# # # # #
//# # # # #
//# # # # #
//# # # # #

//        String shape = " #";
//        for(int i=0; i<5; i++){
//            for(int j =0; j<4; j++) {
//                System.out.print(shape);
//            }
//            System.out.println(shape);


        for(int i=0; i<num; i++){
            for(int j =0; j<num; j++) {
                System.out.print("# ");
            }
            System.out.println();



        }


    }
}
