package inheritance2;

import enums.EnumExamples;

import javax.crypto.Mac;

public class MacBook extends Laptop {

//static int numOfLaptops;
    public MacBook(){
        super();     // calling the Laptop classes constructor.
        // Because without creating an Object for Laptop,we can't use Laptops var.and methods in MacBook.
        //Laptop Object will be created by java by default.
    }

    public void appleId(){

        super.color = "Red";
    }

    public static void main(String[] args) {
        MacBook macBook = new MacBook();
        macBook.color = "Grey";
//        Laptop.numOfLaptops = 45;
//        MacBook.numOfLaptops = 20;
//        System.out.println(Laptop.numOfLaptops);
//        System.out.println(MacBook.numOfLaptops);
        macBook.appleId();


        Lenovo lenovo = new Lenovo();
        lenovo.model = "Lenovo H4";
        lenovo.turnOn();
    }
}
