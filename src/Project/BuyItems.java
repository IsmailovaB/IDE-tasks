package Project;

import java.util.Scanner;

public class BuyItems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cost = 0;
        int items = 3;
        int itemsSpent=0;
//        boolean check = false;
        do{
            System.out.println("Enter cost of item: ");
            int item = input.nextInt();
            cost+=item;
            itemsSpent++;
            if(cost>100){
                System.out.println("You can't spend more than $100");
                continue;
            }


            if (cost==100) {
                break;
            }
            items--;

            if(items == 0) {
                break;
            }
            System.out.println("You spent $"+cost+" so far");

            System.out.println("You may buy up to "+items+" items");

        }while(cost!=100);
        System.out.println("You bought "+itemsSpent+" items, spent $"+cost+" and done shopping");
    }
}
