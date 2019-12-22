package inheritance;

import enums.EnumExamples;
import inheritance2.Laptop;

public class Lenovo extends Laptop {

    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.turnOn();
        lenovo.color = "Black";
        System.out.println(Laptop.numOfLaptops);
    }

}
