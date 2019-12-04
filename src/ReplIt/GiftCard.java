package ReplIt;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int item=3;
        int spent=0;
        int count=0;
//        boolean check = false;
        while(item!=0&&spent!=100){
            System.out.println("Enter cost of item:");
            int itemCost = scan.nextInt();
            spent+=itemCost;
            if(spent>100){
                System.out.println("You can't spend more than $100");
                continue;
            }

            item--;
            count++;
            if(spent<100&&item>0){
                System.out.println("You spent $ "+spent+" so far");
                System.out.println("You may buy up to "+item+ " items");
            }



        }
        System.out.println("You bought "+count+" items, spent "+spent+" and done shopping");



    }
}
