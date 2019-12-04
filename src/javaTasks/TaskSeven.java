import java.util.Scanner;

//package javaTasks;
//
//import java.util.Scanner;
//
//public class TaskSeven {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Write two decimal numbers: ");
//
//        double one = scan.nextDouble();
//        double two = scan.nextDouble();
//        System.out.println("Addition: " + (one+two));
//        System.out.println("Subtraction: " + (one-two));
//        System.out.println("Multiplication: " + (one*two));
//        System.out.println("Division: " + (one/two));
//        System.out.println("Reminder: " + (one%two));
//
//
//
//    }
//
//}
class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //==============================================
        // Task 1
        int price=0;
        int quarter=0;
        int dime=0;
        int nickle=0;

        System.out.println("Enter price in cents:");
        price = input.nextInt();


        // your code here. (DO NOT change existing code)
        //--------------------------------------------

        int change = 100-price;
        quarter = change/25;
        dime = (change%10)/10;
        nickle = (change%5)/5;

        //----------------------------------------------
        System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");

        //==============================================
        //Task 2
        int numberOfCall;
        double bill=0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();

        // your code here. (DO NOT change existing code)
        //----------------------------------------------
        if(numberOfCall<=100){
            bill =200;
        }else if(numberOfCall>=100&&numberOfCall<150){
            bill = 200+(numberOfCall-100)*0.60;

        }else if (numberOfCall>150&&numberOfCall<200){
            bill=200+(50*0.60)+(numberOfCall-150)*0.50;
        }else if(numberOfCall>200) {
            bill=200+(50*0.60)+(50*0.50)+(numberOfCall-200)*0.40;
        }

        //----------------------------------------------
        System.out.println("Your bill is $"+bill);

    }
}
