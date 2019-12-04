package arrayList;

import constructors.Item;

public class StoreItems {
    public static void main(String[] args) {
        Store zara = new Store("Zara","4567 W.Wolf IL");
        Item item1 = new Item("blouse",55.99);
        Item item2 = new Item("Coat", 199.99);
        Item item3 = new Item("T-shirt", 15);

        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);
//
//        System.out.println("Name of the Store: "+zara.name);
//        System.out.println("Address: "+zara.address);
//        System.out.println("Number of items: "+zara.numOfitems);
//        zara.seeInventory();

        zara.addItem();
        zara.seeInventory();
        zara.sellItem("Coat");
        zara.seeInventory();
        System.out.println("\nThe total sale: "+zara.totalSales);

        zara.sellItem("pant");
        zara.seeInventory();
        System.out.println("\nThe total sale: "+zara.totalSales);

        zara.returnItem("Jeans");
        zara.seeInventory();
        System.out.println(zara.totalSales);

    }
}
