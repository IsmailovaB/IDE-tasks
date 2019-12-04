package Project;

import java.util.Scanner;

public class ApPlebaNAna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scan.nextLine().toLowerCase();



        int half = str.length()/2;
        //your code here
        //----------------------------------------------------------
        if ( str.length() < 3 || str.length() >100 ){
            System.out.println("Invalid enter");
        }else if (str.length() % 2 == 1){
            System.out.println(str.substring(0, half) + str.substring(half, half+1).toUpperCase() + str.substring(half+1));
        }else if (str.length() % 2 == 0){
            System.out.println(str.substring(0, half-1) + str.substring(half-1, half+1).toUpperCase() + str.substring(half+1));
        }
    }
}
