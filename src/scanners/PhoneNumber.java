package scanners;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter area code: ");
        int areaCode = scan.nextInt();
        System.out.println("Please enter local number: ");
        int localNum = scan.nextInt();

        String phoneNum = "(" +areaCode+ ")-" +localNum;
        System.out.println( "Your pnone number : " + phoneNum);
    }
}
