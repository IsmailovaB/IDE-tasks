package loops;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        for (int i = 0; i <=50; i++) {
            String temp = i+"";
            if(temp.endsWith("3")){
                continue;
            }


//            if(1%10==3){
//                continue;
//            }
//
//            if (i == 3) {
//                continue;
//            }
//            if (i == 13) {
//                continue;
//            }
//            if (i == 23) {
//                continue;
//            }if(i==33){
//                continue;
//            }
//            if(i==43){
//                continue;
//            }
            System.out.println(i);
        }
    }
}