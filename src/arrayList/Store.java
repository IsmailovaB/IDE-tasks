package arrayList;

import constructors.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Store {
  String name;
  String address;
 List<Item> items = new ArrayList<>();
  int numOfitems;
  double totalSales;

 public Store(String name, String address){
     this.name=name;
     this.address=address;
 }

 public void addItem(Item item){
     this.items.add(item);
     numOfitems++;
 }
 public void addItem(){
     Scanner scan = new Scanner(System.in);
     System.out.println("How many items do you want to enter?");
     int numItem=scan.nextInt();
     scan.nextLine();

     for(int i=0; i<numItem; i++){

         System.out.println("Enter the item name#"+(i+1));
         String itemName = scan.nextLine();
         System.out.println("Enter the price#"+(i+1));
         double price = scan.nextDouble();
         scan.nextLine();

         Item name = new Item(itemName, price);
         this.items.add(name);
         this.numOfitems++;
     }
 }
 public void sellItem(String nameOfItem){

     for(int i=0; i<items.size(); i++) {
        if(items.get(i).name.equals(nameOfItem)) {      // getting each arrays element name, and matching with name, is it equal or not.
            this.totalSales += items.get(i).price;
            items.remove(i);                           //suspicious warning! while you removing the item, it will change
            System.out.println("Thank you! Transaction successful!");
            this.numOfitems--;
            return;                                    // to terminate the method.
        }
     }

     System.out.println("Item is not found");

     }
     public void returnItem(String name){
     Scanner scan = new Scanner(System.in);
         System.out.println("Enter the price of an item: ");
         double price = scan.nextDouble();
         scan.nextLine();
         Item priceOfItem = new Item(name, price);
         items.add(priceOfItem);
         this.numOfitems++;
         this.totalSales-=price;
         System.out.println("\nReturn process successful.");
     }
 public void seeInventory(){
//     for(int i=0; i<items.size(); i++){
//         items.get(i).info();
//     }
     System.out.println("\nZara Chicago Store \nTotal sell: $"+totalSales);
     for(Item item: items){
         item.info();
     }
     System.out.println("The items size: "+items.size());
 }


}
