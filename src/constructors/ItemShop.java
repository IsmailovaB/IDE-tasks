package constructors;

import java.util.Scanner;

public class ItemShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items do you have?");
        int items = scan.nextInt();
        scan.nextLine();
        Item [] allItems = new Item[items];
        for (int i=0; i<allItems.length; i++){
            System.out.println("Enter the name of the item:"+(i+1));
            String item = scan.nextLine();
            System.out.println("Enter the price of an item: "+(i+1));
            double price = scan.nextDouble();
            scan.nextLine();
            allItems[i] = new Item(item,price);
        }
        for(Item item: allItems){
            item.info();
        }
    }
}
